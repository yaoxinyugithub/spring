package com.yao;

import com.yao.config.JavaConfig;
import com.yao.servcie.UserService;
import org.springframework.cglib.proxy.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-17 10:02
 */
public class AppTestProxy {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		UserService bean = context.getBean(UserService.class);

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(UserService.class);
		enhancer.setCallbacks(new Callback[]{new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("spring的cglib代理---before");
//				Object result = methodProxy.invoke(bean, objects);
//				Object result = method.invoke(bean, objects);
				Object result = methodProxy.invokeSuper(o, objects);
				System.out.println("spring的cglib代理---after");
				return result;
			}
		}, NoOp.INSTANCE});
		enhancer.setCallbackFilter(new CallbackFilter() {
			@Override
			public int accept(Method method) {
				if (method.getName().equals("test")) {
					return 1;
				}
				return 0;
			}
		});
		UserService userService = (UserService) enhancer.create();
		userService.sayHello();
		userService.test();
		System.out.println(userService);
	}
}

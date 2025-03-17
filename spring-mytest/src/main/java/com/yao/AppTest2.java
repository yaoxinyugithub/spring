package com.yao;

import com.yao.advice.MyBeforeAdvice;
import com.yao.servcie.UserService;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-17 14:19
 */
public class AppTest2 {
	public static void main(String[] args) {
		UserService userService = new UserService();
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(userService);
		proxyFactory.addAdvisor(new PointcutAdvisor() {
			@Override
			public Pointcut getPointcut() {
				return new StaticMethodMatcherPointcut() {
					@Override
					public boolean matches(Method method, Class<?> targetClass) {
						return method.getName().equals("sayHello");
					}
				};
			}

			@Override
			public Advice getAdvice() {
				return new MyBeforeAdvice();
			}

			@Override
			public boolean isPerInstance() {
				return false;
			}
		});
		UserService proxy = (UserService) proxyFactory.getProxy();
		proxy.sayHello();
		System.out.println("-----------------------");
		proxy.test();

	}
}

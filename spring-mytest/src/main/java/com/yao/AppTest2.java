package com.yao;

import com.yao.advice.*;
import com.yao.servcie.UserService;
import org.springframework.aop.framework.ProxyFactory;

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
		proxyFactory.addAdvice(new MyBeforeAdvice());
		proxyFactory.addAdvice(new MyAroundAdvice());
		UserService proxy = (UserService) proxyFactory.getProxy();
		proxy.sayHello();
		System.out.println("-----------------------");
		proxy.test();

	}
}

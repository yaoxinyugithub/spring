package com.yao.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-17 14:45
 */
public class MyAroundAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("around方法拦截器--before");
		invocation.proceed();
		System.out.println("around方法拦截器--after");
		return null;
	}
}

package com.yao.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-17 14:30
 */
public class MyAfterReturnAdvice  implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("方法执行后执行----after");
	}
}

package com.yao.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-17 14:39
 */
public class MyThrowsAdvice implements ThrowsAdvice {
	public void afterThrowing(Method method, Object[] args, Object target, NullPointerException ex){
		System.out.println("方法抛出异常，执行拦截");
	}
}

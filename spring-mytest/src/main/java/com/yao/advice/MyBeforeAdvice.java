package com.yao.advice;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-17 14:32
 */
@Component
public class MyBeforeAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("方法执行之前执行----before");
	}
}

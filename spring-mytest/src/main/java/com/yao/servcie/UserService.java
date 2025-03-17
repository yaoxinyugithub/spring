package com.yao.servcie;

import org.springframework.stereotype.Component;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-11 13:50
 */
@Component
public class UserService {

	public void sayHello() {
		System.out.println("hello userService");
	}

	public void test(){
		System.out.println("test");
	}
}

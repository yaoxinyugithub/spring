package com.yao;

import com.yao.config.JavaConfig;
import com.yao.servcie.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-17 15:07
 */
public class AppTest3 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		OrderService bean = context.getBean(OrderService.class);
		bean.test();
		System.out.println("--------------------");
		UserService userService = context.getBean(UserService.class);
		userService.test();

		System.out.println("-------------------------");
		TravelService travelService = context.getBean(TravelService.class);
		travelService.travel();
	}
}

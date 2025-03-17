package com.yao.config;

import com.yao.advice.MyBeforeAdvice;
import com.yao.entity.User;
import com.yao.servcie.OrderService;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.*;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-11 13:19
 */
@Configuration
@ComponentScan(basePackages = "com.yao")
public class JavaConfig {
	@Bean
	public User user() {
		return new User("yao", 18);
	}

	@Bean
	public ProxyFactoryBean orderService(){
		OrderService orderService = new OrderService();
		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
		proxyFactoryBean.setTarget(orderService);
		proxyFactoryBean.addAdvice(new MyBeforeAdvice());
		return proxyFactoryBean;
	}
}

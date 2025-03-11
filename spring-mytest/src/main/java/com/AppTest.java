package com;

import com.yao.config.JavaConfig;
import com.yao.servcie.OrderService;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-11 13:10
 */

public class AppTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(context);
//		annotatedBeanDefinitionReader.registerBean(UserService.class);
//		UserService bean = context.getBean(UserService.class);
//		bean.sayHello();

		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(context);
		int i = xmlBeanDefinitionReader.loadBeanDefinitions("spring.xml");
		OrderService bean = context.getBean(OrderService.class);
		bean.test();

	}



}

package com;

import com.yao.config.JavaConfig;
import com.yao.servcie.UserService;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-11 13:10
 */

public class AppTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//		beanDefinition.setBeanClass(UserService.class );
//		beanDefinition.setScope("prototype");
//		context.registerBeanDefinition("userService", beanDefinition);
		AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(context);
		annotatedBeanDefinitionReader.registerBean(UserService.class);
		UserService bean = context.getBean(UserService.class);
		bean.sayHello();

	}
}

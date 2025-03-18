package com.yao;

import com.yao.config.JavaConfig;
import com.yao.servcie.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-18 10:28
 */
public class AppTestTransaction1 {

    public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		ProductService bean = context.getBean(ProductService.class);
		bean.test();
	}
}

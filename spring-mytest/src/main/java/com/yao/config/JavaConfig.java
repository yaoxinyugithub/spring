package com.yao.config;

import com.yao.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-11 13:19
 */
@Configuration
public class JavaConfig {
	@Bean
	public User user() {
		return new User("yao", 18);
	}
}

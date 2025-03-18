package com.yao.servcie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-18 10:37
 */
@Component
public class ProductService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void test() {
		Map<String, Object> map = jdbcTemplate.queryForMap("select * from tel_call_record");
		System.out.println(map);
	}
}

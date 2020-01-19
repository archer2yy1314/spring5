package com.study.conf;

import com.study.bean.OrderService;
import com.study.bean.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Auther: zhangzhipeng
 * @Date: 2019/11/17 17:38
 * @Description: TODO
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.study.bean")
@Scope(scopeName = "prototype")
public class UserConf {
	@Bean
	public UserService userService() {
		orderService();
		return new UserService();
	}
	@Bean
	public OrderService orderService() {
		System.out.println("orderservice>>>>>");
		return new OrderService();
	}

}

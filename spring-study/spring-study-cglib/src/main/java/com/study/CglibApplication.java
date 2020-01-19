package com.study;

import com.study.bean.UserService;
import com.study.conf.UserConf;
import com.study.controller.UserController;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * @Auther: zhangzhipeng
 * @Date: 2019/11/17 17:27
 * @Description: TODO
 * @Version 1.0
 */
public class CglibApplication {
	public static void main(String[] args) {
		/*AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(UserConf.class);
		ctx.refresh();*/

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConf.class, UserController.class);
		Object obj = context.getBean(UserController.class);
		UserController user = (UserController)obj;
		System.out.println(">>>"+user.getUserInfo());
		//UserService userService = (UserService) context.getBean("userService");
		//System.out.println(userService.query());
	}
}

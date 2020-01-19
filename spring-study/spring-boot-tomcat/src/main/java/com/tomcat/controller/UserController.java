package com.tomcat.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: zhangzhipeng
 * @Date: 2019/11/18 10:41
 * @Description: TODO
 * @Version 1.0
 */
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/getUserInfo")
	@ResponseBody
	public String getUserInfo() {
		return "hello world!";
	}

}

package com.study.controller;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
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
	@Transactional(isolation = Isolation.DEFAULT)
	public String getUserInfo() {
		return "hello world!";
	}

}

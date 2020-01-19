package com.tomcat.conf;

import com.tomcat.bean.TestA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: zhangzhipeng
 * @Date: 2019/11/18 10:25
 * @Description: TODO
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.tomcat")
public class AppConf implements WebMvcConfigurer {
	@Override
	public void addFormatters(FormatterRegistry registry) {

	}
}

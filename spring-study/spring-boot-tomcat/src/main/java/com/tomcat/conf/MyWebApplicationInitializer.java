package com.tomcat.conf;

import com.tomcat.bean.TestA;
import com.tomcat.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @Auther: zhangzhipeng
 * @Date: 2019/11/18 09:54
 * @Description: tomcat启动时候会将此WebApplicationInitializer传入SpringServletContainerInitializer的onStartup中
 * @Version 1.0
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("tomcat startup starting****");
		try {
			//初始化spring上下文
			//AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(AppConf.class);
			AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
			context.register(AppConf.class);
			context.refresh();
			UserController bean = context.getBeanFactory().getBean(UserController.class);
			String info = bean.getUserInfo();
			System.out.println("info-------->" + info);
			//web环境
			DispatcherServlet servlet = new DispatcherServlet(context);
			ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", servlet);
			dispatcher.setLoadOnStartup(1);
			dispatcher.addMapping("/");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

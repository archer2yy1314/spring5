package com.tomcat;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

/**
 * @Auther: zhangzhipeng
 * @Date: 2019/11/18 09:51
 * @Description: TODO
 * @Version 1.0
 */
public class TomcatStartApp {
	public static void main(String[] args) {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8090);

		try {
			tomcat.addWebapp("/", "/tmp");
		} catch (ServletException e) {
			e.printStackTrace();
		}
		//tomcat.addServlet("/", "dispatcher", new MyDispaterServlet());
		try {
			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}

	}
}

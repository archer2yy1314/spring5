package test.demo;

import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.util.ClassUtils;

import javax.annotation.ManagedBean;

/**
 * @Auther: zhangzhipeng
 * @Date: 2019/5/10 15:00
 * @Description: TODO
 * @Version 1.0
 */
public class ClazzDemo {
	public static void main(String[] args) {
		try {
			Class clazz = ClassUtils.forName("javax.annotation.ManagedBean", ClassPathScanningCandidateComponentProvider.class.getClassLoader());
			System.out.println(clazz.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

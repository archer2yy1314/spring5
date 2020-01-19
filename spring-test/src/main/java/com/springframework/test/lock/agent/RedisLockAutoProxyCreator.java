package com.springframework.test.lock.agent;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Auther: zhangzhipeng
 * @Date: 2019/5/17 16:54
 * @Description:
 * 接口方法postProcessBeforeInitialization会在属性设置完成后，初始化方法（init-method）执行之前被回调。
 * 接口方法postProcessAfterInitialization初始化方法（init-method）执行之后被回调。
 * @Version 1.0
 */
public class RedisLockAutoProxyCreator implements BeanPostProcessor {
	//private RedisLock redisLock;
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		return null;
	}
}

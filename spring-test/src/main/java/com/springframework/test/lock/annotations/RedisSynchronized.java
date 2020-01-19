package com.springframework.test.lock.annotations;

import java.lang.annotation.*;

/**
 * @Auther: zhangzhipeng
 * @Date: 2019/5/17 16:50
 * @Description: TODO
 * @Version 1.0
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RedisSynchronized {

	String value() default "";

	String fallbackMethod() default "";
}

package com.haoze.annotation;

import java.lang.annotation.*;

/**
 * @author maxl
 * @time on 2018-12-17
 */
@Target(ElementType.PARAMETER)          // 可用在方法的参数上
@Retention(RetentionPolicy.RUNTIME)     // 运行时有效
@Documented
public @interface ValidationParam {
    /**
     * 必填参数
     */
    String value() default "";
}

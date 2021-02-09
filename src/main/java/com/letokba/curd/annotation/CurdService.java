package com.letokba.curd.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author Yong
 * @date 2021/2/9
 */
@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface CurdService {

    @AliasFor(
            annotation = Component.class
    )
    String value() default "";

}

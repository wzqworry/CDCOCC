package com.biierg.cocc.common.annotation;

import com.biierg.cocc.common.util.Constants;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wzq on 2017/8/21.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ java.lang.annotation.ElementType.METHOD })
public @interface DataSource {
    String value() default Constants.DATABASE.dbOne;
}

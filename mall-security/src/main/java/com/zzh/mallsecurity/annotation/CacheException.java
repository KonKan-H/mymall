package com.zzh.mallsecurity.annotation;

import java.lang.annotation.*;

/**
 * @Date: 2020/12/7 15:08
 * @Author: zzh
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}

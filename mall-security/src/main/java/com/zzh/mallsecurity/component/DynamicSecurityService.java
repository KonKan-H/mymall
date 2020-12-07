package com.zzh.mallsecurity.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * 动态权限相关业务类
 * @Date: 2020/12/7 15:19
 * @Author: zzh
 */
public interface DynamicSecurityService {

    /**
     * 加载资源ANT通配符和资源对应MAP
     * @return
     */
    Map<String, ConfigAttribute> loadDataSource();
}

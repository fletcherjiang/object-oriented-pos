package com.longyx.spring.security.jwt.common.util;

import com.longyx.spring.security.jwt.security.entity.SelfUser;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Security工具类
 * @author Mr.Longyx
 * @date 2020年01月10日 22:34
 */
public class WebSecurityUtil {

    /**
     * 私有化构造器
     */
    private WebSecurityUtil(){}

    /**
     * 获取当前用户信息
     */
    public static SelfUser getUserInfo(){
        SelfUser userDetails = (SelfUser) SecurityContextHolder.getContext().getAuthentication() .getPrincipal();
        return userDetails;
    }
    /**
     * 获取当前用户ID
     */
    public static Long getUserId(){
        return getUserInfo().getUserId();
    }
    /**
     * 获取当前用户账号
     */
    public static String getUserName(){
        return getUserInfo().getUsername();
    }
}

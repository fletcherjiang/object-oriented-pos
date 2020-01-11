package com.longyx.spring.security.jwt.common.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Jwt配置类
 * @author Mr.Longyx
 * @date 2020年01月09日 9:44
 */
@Getter
@Component
@ConfigurationProperties(prefix = "jwt")
public class JwtConfig implements Serializable{
    private static final long serialVersionUID = -1503938984890880492L;
    /**
     * 密钥KEY
     */
    public static String secret;
    /**
     * TokenKey
     */
    public static String tokenHeader;
    /**
     * Token前缀字符
     */
    public static String tokenPrefix;
    /**
     * 过期时间
     */
    public static Integer expiration;
    /**
     * 不需要认证的接口
     */
    public static String antMatchers;


    public void setSecret(String secret) {
        JwtConfig.secret = secret;
    }

    public void setTokenHeader(String tokenHeader) {
        JwtConfig.tokenHeader = tokenHeader;
    }

    public void setTokenPrefix(String tokenPrefix) {
        JwtConfig.tokenPrefix = tokenPrefix;
    }

    public void setExpiration(Integer expiration) {
        JwtConfig.expiration = expiration * 1000;
    }

    public void setAntMatchers(String antMatchers) {
        JwtConfig.antMatchers = antMatchers;
    }
}
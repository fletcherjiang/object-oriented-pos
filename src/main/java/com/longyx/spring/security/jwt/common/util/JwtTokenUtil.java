package com.longyx.spring.security.jwt.common.util;

import com.alibaba.fastjson.JSON;
import com.longyx.spring.security.jwt.common.config.JwtConfig;
import com.longyx.spring.security.jwt.security.entity.SelfUser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * Jwt工具类
 * @author Mr.Longyx
 * @date 2020年01月10日 22:28
 */
@Slf4j
public class JwtTokenUtil {
    /**
     * 私有化构造器
     * @author Mr.Longyx
     * @date 2020/1/10 22:29
     */
    private JwtTokenUtil(){}

    /**
     * 生成Token
     * @author Mr.Longyx
     * @date 2020/1/10 22:30
     * @param selfUserEntity  用户安全实体
     * @return java.lang.String
     */
    public static String createAccessToken(SelfUser selfUserEntity){
        // 登陆成功生成JWT
        String token = Jwts.builder()
                // 放入用户名和用户ID
                .setId(selfUserEntity.getUserId()+"")
                // 主题
                .setSubject(selfUserEntity.getUsername())
                // 签发时间
                .setIssuedAt(new Date())
                // 签发者
                .setIssuer("sans")
                // 自定义属性 放入用户拥有权限
                .claim("authorities", JSON.toJSONString(selfUserEntity.getAuthorities()))
                // 失效时间
                .setExpiration(new Date(System.currentTimeMillis() + JwtConfig.expiration))
                // 签名算法和密钥
                .signWith(SignatureAlgorithm.HS512, JwtConfig.secret)
                .compact();
        return token;
    }
}

package com.longyx.spring.security.jwt.security.handler;

import com.longyx.spring.security.jwt.common.config.JwtConfig;
import com.longyx.spring.security.jwt.common.util.JwtTokenUtil;
import com.longyx.spring.security.jwt.common.util.ResultUtil;
import com.longyx.spring.security.jwt.security.entity.SelfUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 登录成功处理类
 * @author Mr.Longyx
 * @date 2020年01月11日 9:53
 */
@Slf4j
@Component
public class UserLoginSuccessHandler implements AuthenticationSuccessHandler {
    /**
     * 登录成功返回结果
     * @Author Sans
     * @CreateTime 2019/10/3 9:27
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication){
        // 组装JWT
        SelfUser selfUser =  (SelfUser) authentication.getPrincipal();
        String token = JwtTokenUtil.createAccessToken(selfUser);
        token = JwtConfig.tokenPrefix + token;
        // 封装返回参数
        Map<String,Object> resultData = new HashMap<>();
        resultData.put("code","200");
        resultData.put("msg", "登录成功");
        resultData.put("token",token);
        ResultUtil.responseJson(response,resultData);
    }
}

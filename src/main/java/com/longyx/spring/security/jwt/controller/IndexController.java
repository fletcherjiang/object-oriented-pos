package com.longyx.spring.security.jwt.controller;

import com.longyx.spring.security.jwt.common.util.ResultUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 初始页面
 * @author Mr.Longyx
 * @date 2020年01月11日 10:07
 */
@RestController
@RequestMapping("/index")
public class IndexController {


    /**
     * 首页
     * @Author Longyx
     * @CreateTime 2019/10/2 15:23
     * @Return Map<String,Object> 返回数据MAP
     */
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public Map<String,Object> userLogin(){
        // 组装参数
        Map<String,Object> result = new HashMap<>();
        result.put("title","这里是首页不需要权限和登录拦截");
        return ResultUtil.resultSuccess(result);
    }

}

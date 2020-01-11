package com.longyx.spring.security.jwt.controller;

import com.longyx.spring.security.jwt.common.util.ResultUtil;
import com.longyx.spring.security.jwt.core.dataobject.SysPermission;
import com.longyx.spring.security.jwt.core.service.SysPermissionService;
import com.longyx.spring.security.jwt.security.entity.SelfUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 普通用户
 * @author Mr.Longyx
 * @date 2020年01月11日 10:08
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SysPermissionService sysPermissionService;

    /**
     * 用户端信息
     * @Author Longyx
     * @CreateTime 2019/10/2 14:52
     * @Return Map<String,Object> 返回数据MAP
     */
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public Map<String,Object> userLogin(){
        Map<String,Object> result = new HashMap<>();
        SelfUser userDetails = (SelfUser) SecurityContextHolder.getContext().getAuthentication() .getPrincipal();
        result.put("title","用户端信息");
        result.put("data",userDetails);
        return ResultUtil.resultSuccess(result);
    }

    /**
     * 拥有USER角色和sys:user:info权限可以访问
     * @Author Longyx
     * @CreateTime 2019/10/2 14:22
     * @Return Map<String,Object> 返回数据MAP
     */
    @PreAuthorize("hasRole('USER') and hasPermission('/user/permissionList','sys:user:info')")
    @RequestMapping(value = "/permissionList",method = RequestMethod.GET)
    public Map<String,Object> sysPermission(){
        Map<String,Object> result = new HashMap<>();
        List<SysPermission> sysPermissionList = sysPermissionService.list();
        result.put("title","拥有USER角色和sys:user:info权限可以访问");
        result.put("data",sysPermissionList);
        return ResultUtil.resultSuccess(result);
    }

}

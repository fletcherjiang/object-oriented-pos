package com.longyx.spring.security.jwt.controller;

import com.longyx.spring.security.jwt.common.util.ResultUtil;
import com.longyx.spring.security.jwt.common.util.WebSecurityUtil;
import com.longyx.spring.security.jwt.core.dataobject.SysPermission;
import com.longyx.spring.security.jwt.core.dataobject.SysRole;
import com.longyx.spring.security.jwt.core.dataobject.SysUser;
import com.longyx.spring.security.jwt.core.service.SysPermissionService;
import com.longyx.spring.security.jwt.core.service.SysRoleService;
import com.longyx.spring.security.jwt.core.service.SysUserService;
import com.longyx.spring.security.jwt.security.entity.SelfUser;
import org.apache.catalina.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 管理端
 * @author Mr.Longyx
 * @date 2020年01月11日 10:04
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysPermissionService sysPermissionService;

    /**
     * 管理端信息
     * @Author Longyx
     * @CreateTime 2019/10/2 14:22
     * @Return Map<String,Object> 返回数据MAP
     */
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public Map<String,Object> userLogin(){
        Map<String,Object> result = new HashMap<>();
        SelfUser userDetails = WebSecurityUtil.getUserInfo();
        result.put("title","管理端信息");
        result.put("data",userDetails);
        return ResultUtil.resultSuccess(result);
    }

    /**
     * 拥有ADMIN或者USER角色可以访问
     * @Author Longyx
     * @CreateTime 2019/10/2 14:22
     * @Return Map<String,Object> 返回数据MAP
     */
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> list(){
        Map<String,Object> result = new HashMap<>();
        List<SysUser> sysUserList = sysUserService.list();
        result.put("title","拥有用户或者管理员角色都可以查看");
        result.put("data",sysUserList);
        return ResultUtil.resultSuccess(result);
    }

    /**
     * 拥有ADMIN和USER角色可以访问
     * @Author Longyx
     * @CreateTime 2019/10/2 14:22
     * @Return Map<String,Object> 返回数据MAP
     */
    @PreAuthorize("hasRole('ADMIN') and hasRole('USER')")
    @RequestMapping(value = "/permissionList",method = RequestMethod.GET)
    public Map<String,Object> PermissionList(){
        Map<String,Object> result = new HashMap<>();
        List<SysPermission> sysPermissionList = sysPermissionService.list();
        result.put("title","拥有用户和管理员角色都可以查看");
        result.put("data",sysPermissionList);
        return ResultUtil.resultSuccess(result);
    }


    /**
     * 拥有sys:user:info权限可以访问
     * hasPermission 第一个参数是请求路径 第二个参数是权限表达式
     * @Author Longyx
     * @CreateTime 2019/10/2 14:22
     * @Return Map<String,Object> 返回数据MAP
     */
    @PreAuthorize("hasPermission('/admin/userList','sys:user:info')")
    @RequestMapping(value = "/userList",method = RequestMethod.GET)
    public Map<String,Object> userList(){
        Map<String,Object> result = new HashMap<>();
        List<SysUser> sysUserList = sysUserService.list();
        result.put("title","拥有sys:user:info权限都可以查看");
        result.put("data",sysUserList);
        return ResultUtil.resultSuccess(result);
    }


    /**
     * 拥有ADMIN角色和sys:role:info权限可以访问
     * @Author Longyx
     * @CreateTime 2019/10/2 14:22
     * @Return Map<String,Object> 返回数据MAP
     */
    @PreAuthorize("hasRole('ADMIN') and hasPermission('/admin/adminRoleList','sys:role:info')")
    @RequestMapping(value = "/adminRoleList",method = RequestMethod.GET)
    public Map<String,Object> adminRoleList(){
        Map<String,Object> result = new HashMap<>();
        List<SysRole> sysRoleList = sysRoleService.list();
        result.put("title","拥有ADMIN角色和sys:role:info权限可以访问");
        result.put("data",sysRoleList);
        return ResultUtil.resultSuccess(result);
    }
}

package com.longyx.spring.security.jwt.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.longyx.spring.security.jwt.core.dataobject.SysPermission;
import com.longyx.spring.security.jwt.core.dataobject.SysRole;
import com.longyx.spring.security.jwt.core.dataobject.SysUser;

import java.util.List;

/**
 * 系统用户业务接口
 * @author Mr.Longyx
 * @date 2020年01月10日 22:56
 */
public interface SysUserService extends IService<SysUser> {
    /**
     * 根据用户名查询实体
     * @Author Longyx
     * @CreateTime 2019/9/14 16:30
     * @Param  username 用户名
     * @Return SysUser 用户实体
     */
    SysUser selectUserByName(String username);
    /**
     * 根据用户ID查询角色集合
     * @Author Longyx
     * @CreateTime 2019/9/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysRole> 角色名集合
     */
    List<SysRole> selectSysRoleByUserId(Long userId);
    /**
     * 根据用户ID查询权限集合
     * @Author Longyx
     * @CreateTime 2019/9/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysPermission> 角色名集合
     */
    List<SysPermission> selectSysPermissionByUserId(Long userId);

}

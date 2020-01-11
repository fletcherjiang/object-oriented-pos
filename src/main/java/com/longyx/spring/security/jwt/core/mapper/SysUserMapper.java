package com.longyx.spring.security.jwt.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.longyx.spring.security.jwt.core.dataobject.SysPermission;
import com.longyx.spring.security.jwt.core.dataobject.SysRole;
import com.longyx.spring.security.jwt.core.dataobject.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Mr.Longyx
 * @date 2020年01月10日 22:41
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    /**
     * 通过用户ID查询角色集合
     * @Author Longyx
     * @CreateTime 2019/9/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysRole> 角色名集合
     */
    List<SysRole> selectSysRoleByUserId(Long userId);
    /**
     * 通过用户ID查询权限集合
     * @Author Longyx
     * @CreateTime 2019/9/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysPermissionEntity> 角色名集合
     */
    List<SysPermission> selectSysPermissionByUserId(Long userId);

}

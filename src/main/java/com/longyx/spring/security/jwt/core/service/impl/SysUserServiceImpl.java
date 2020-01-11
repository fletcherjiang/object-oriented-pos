package com.longyx.spring.security.jwt.core.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.longyx.spring.security.jwt.core.dataobject.SysPermission;
import com.longyx.spring.security.jwt.core.dataobject.SysRole;
import com.longyx.spring.security.jwt.core.dataobject.SysUser;
import com.longyx.spring.security.jwt.core.mapper.SysUserMapper;
import com.longyx.spring.security.jwt.core.service.SysUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr.Longyx
 * @date 2020年01月10日 23:03
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    /**
     * 根据用户名查询实体
     * @Author Longyx
     * @CreateTime 2019/9/14 16:30
     * @Param  username 用户名
     * @Return SysUser 用户实体
     */
    @Override
    public SysUser selectUserByName(String username) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysUser::getUsername,username);
        return this.baseMapper.selectOne(queryWrapper);
    }
    /**
     * 通过用户ID查询角色集合
     * @Author Longyx
     * @CreateTime 2019/9/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysRole> 角色名集合
     */
    @Override
    public List<SysRole> selectSysRoleByUserId(Long userId) {
        return this.baseMapper.selectSysRoleByUserId(userId);
    }

    /**
     * 根据用户ID查询权限集合
     * @Author Longyx
     * @CreateTime 2019/9/18 18:01
     * @Param userId 用户ID
     * @Return List<SysMenu> 角色名集合
     */
    @Override
    public List<SysPermission> selectSysPermissionByUserId(Long userId) {
        return this.baseMapper.selectSysPermissionByUserId(userId);
    }
}

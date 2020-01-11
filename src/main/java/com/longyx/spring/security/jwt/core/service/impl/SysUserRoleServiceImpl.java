package com.longyx.spring.security.jwt.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.longyx.spring.security.jwt.core.dataobject.SysUserRole;
import com.longyx.spring.security.jwt.core.mapper.SysUserRoleMapper;
import com.longyx.spring.security.jwt.core.service.SysUserRoleService;
import org.springframework.stereotype.Service;

/**
 * @Description 用户与角色业务实现
 * @Author Longyx
 * @CreateTime 2019/9/14 15:57
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

}

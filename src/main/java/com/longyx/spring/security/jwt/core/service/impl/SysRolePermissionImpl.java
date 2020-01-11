package com.longyx.spring.security.jwt.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.longyx.spring.security.jwt.core.dataobject.SysRolePermission;
import com.longyx.spring.security.jwt.core.mapper.SysRolePermissionMapper;
import com.longyx.spring.security.jwt.core.service.SysRolePermissionService;
import org.springframework.stereotype.Service;

/**
 * 角色与权限业务实现
 * @author Mr.Longyx
 * @date 2020年01月11日 9:30
 */
@Service("sysRolePermissionService")
public class SysRolePermissionImpl extends ServiceImpl<SysRolePermissionMapper, SysRolePermission> implements SysRolePermissionService {

}

package com.longyx.spring.security.jwt.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.longyx.spring.security.jwt.core.dataobject.SysRole;
import com.longyx.spring.security.jwt.core.mapper.SysRoleMapper;
import com.longyx.spring.security.jwt.core.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * 角色业务实现
 * @author Mr.Longyx
 * @date 2020年01月11日 9:27
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

}

package com.longyx.spring.security.jwt.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.longyx.spring.security.jwt.core.dataobject.SysPermission;
import com.longyx.spring.security.jwt.core.mapper.SysPermissionMapper;
import com.longyx.spring.security.jwt.core.service.SysPermissionService;
import org.springframework.stereotype.Service;

/**
 * 权限业务实现
 * @author Mr.Longyx
 * @date 2020年01月11日 9:32
 */
@Service("sysPermissionService")
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements SysPermissionService {

}

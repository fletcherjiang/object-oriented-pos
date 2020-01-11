package com.longyx.spring.security.jwt.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.longyx.spring.security.jwt.core.dataobject.SysRolePermission;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色权限关系Mapper
 * @author Mr.Longyx
 * @date 2020年01月10日 22:39
 */
@Mapper
public interface SysRolePermissionMapper extends BaseMapper<SysRolePermission> {
}

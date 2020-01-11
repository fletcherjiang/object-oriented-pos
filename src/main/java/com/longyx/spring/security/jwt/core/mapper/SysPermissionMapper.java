package com.longyx.spring.security.jwt.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.longyx.spring.security.jwt.core.dataobject.SysPermission;
import org.apache.ibatis.annotations.Mapper;

/**
 * 权限mapper
 * @author Mr.Longyx
 * @date 2020年01月10日 22:36
 */
@Mapper
public interface SysPermissionMapper extends BaseMapper<SysPermission> {
}

package com.longyx.spring.security.jwt.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.longyx.spring.security.jwt.core.dataobject.SysUserRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户与角色关系Mapper
 * @author Mr.Longyx
 * @date 2020年01月10日 22:42
 */
@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
}

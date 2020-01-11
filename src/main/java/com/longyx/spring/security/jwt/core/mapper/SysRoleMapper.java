package com.longyx.spring.security.jwt.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.longyx.spring.security.jwt.core.dataobject.SysRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色Mapper
 * @author Mr.Longyx
 * @date 2020年01月10日 22:38
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {
}

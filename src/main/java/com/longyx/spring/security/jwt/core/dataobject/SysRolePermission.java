package com.longyx.spring.security.jwt.core.dataobject;
import	java.io.DataInput;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 角色与权限关系实体
 * @author Mr.Longyx
 * @date 20Data1月10日 22:51
 */
@Data
@TableName("sys_role_permission")
public class SysRolePermission implements Serializable {
    private static final long serialVersionUID = 7267448223385648518L;
    /**
     * ID
     */
    @TableId
    private Long id;
    /**
     * 角色ID
     */
    private Long roleId;
    /**
     * 权限ID
     */
    private Long permissionId;
}

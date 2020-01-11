package com.longyx.spring.security.jwt.core.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Mr.Longyx
 * @date 2020年01月10日 22:47
 */
@Data
@TableName("sys_permission")
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 2866971655564838944L;
    /**
     * 权限ID
     */
    @TableId
    private Long permissionId;
    /**
     * 权限名称
     */
    private String name;
    /**
     * 权限标识
     */
    private String permission;

}

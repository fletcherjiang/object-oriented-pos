package com.longyx.spring.security.jwt;

import com.longyx.spring.security.jwt.core.dataobject.SysUser;
import com.longyx.spring.security.jwt.core.dataobject.SysUserRole;
import com.longyx.spring.security.jwt.core.service.SysUserRoleService;
import com.longyx.spring.security.jwt.core.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringSecurityJwtApplicationTests {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private SysUserRoleService sysUserRoleService;


    /**
     * 注册用户
     */
    @Test
    public void contextLoads() {
        // 注册用户
        SysUser sysUser = new SysUser();
        sysUser.setUsername("joe");
        sysUser.setPassword(bCryptPasswordEncoder.encode("hadoop"));
        // 设置用户状态
        sysUser.setStatus("NORMAL");
        sysUserService.save(sysUser);
        // 分配角色 1:ADMIN 2:USER
        SysUserRole sysUserRole = new SysUserRole();
        sysUserRole.setRoleId(2L);
        sysUserRole.setUserId(sysUser.getUserId());
        sysUserRoleService.save(sysUserRole);
    }

}

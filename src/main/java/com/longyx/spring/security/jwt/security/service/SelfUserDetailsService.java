package com.longyx.spring.security.jwt.security.service;

import com.longyx.spring.security.jwt.core.dataobject.SysUser;
import com.longyx.spring.security.jwt.core.service.SysUserService;
import com.longyx.spring.security.jwt.security.entity.SelfUser;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * Spring Security用户的业务实现
 * @author Mr.Longyx
 * @date 2020年01月11日 9:41
 */
@Component
public class SelfUserDetailsService implements UserDetailsService {
    @Autowired
    private SysUserService sysUserService;

    /**
     * 查询用户信息
     * @Author Longyx
     * @CreateTime 2019/9/13 17:23
     * @Param  username  用户名
     * @Return UserDetails SpringSecurity用户信息
     */
    @Override
    public SelfUser loadUserByUsername(String username) throws UsernameNotFoundException {
        // 查询用户信息
        SysUser sysUser =sysUserService.selectUserByName(username);
        if (sysUser!=null){
            // 组装参数
            SelfUser selfUser = new SelfUser();
            BeanUtils.copyProperties(sysUser,selfUser);
            return selfUser;
        }
        return null;
    }
}

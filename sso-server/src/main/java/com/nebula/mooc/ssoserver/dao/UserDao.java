/*
 * @author Zhanghh
 * @date 2019/4/4
 */
package com.nebula.mooc.ssoserver.dao;

import com.nebula.mooc.core.entity.LoginUser;
import org.springframework.stereotype.Component;

@Component
public interface UserDao {

    int login(LoginUser loginUser);
}

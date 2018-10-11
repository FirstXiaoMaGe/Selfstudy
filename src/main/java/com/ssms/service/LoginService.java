package com.ssms.service;

import com.ssms.domain.Role;
import com.ssms.domain.User;

import java.util.Map;

/**
 * @Author liuxuke
 * @Title: LoginService
 * @ProjectName smms
 * @Description: //TODO
 * @date 2018/10/11 17:55
 */
public interface LoginService {

    User addUser(Map<String, Object> map);

    Role addRole(Map<String, Object> map);

    User findByName(String name);
}

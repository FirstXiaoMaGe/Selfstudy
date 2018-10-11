package com.ssms.repository;

import com.ssms.domain.User;

/**
 * @Author liuxuke
 * @Title: UserRepository
 * @ProjectName smms
 * @Description: //TODO
 * @date 2018/10/11 17:52
 */
public interface UserRepository extends BaseRepository<User,Long>{
    User findByName(String name);
}

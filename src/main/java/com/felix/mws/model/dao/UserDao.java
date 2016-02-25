package com.felix.mws.model.dao;

import com.felix.mws.model.entity.User;

/**
 * Created by fsoewito on 2/20/2016.
 */

public interface UserDao extends GenericRepository<User, Integer> {
    User findByName(String name);
}

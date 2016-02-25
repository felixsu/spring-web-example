package com.felix.mws.service;

import com.felix.mws.model.dao.UserDao;
import com.felix.mws.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fsoewito on 2/20/2016.
 */

@Service
public class UserService extends GenericService<User, Integer> {

    @Autowired
    public UserService(UserDao repository) {
        super(repository);
    }
}

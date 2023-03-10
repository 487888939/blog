package com.lrm.service;

import com.lrm.dao.UserRepository;
import com.lrm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by limi on 2017/10/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username,password );//MD5Utils.code(password);
        return user;
    }
}

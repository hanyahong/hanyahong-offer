package com.hanyahong.service.impl;

import com.hanyahong.model.user.User;
import com.hanyahong.repo.impl.UserRepoImpl;
import com.hanyahong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/1/22.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepoImpl repo;

    @Override
    public User selUserService(String id) {
        return repo.selUserRepoAllInfo(id);
    }

    @Override
    public void updateUserService(String id) {

    }

    @Override
    public void addUserService(User user) {

    }
}

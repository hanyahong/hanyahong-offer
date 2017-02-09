package com.hanyahong.service.impl;

import com.hanyahong.model.StatusInfo;
import com.hanyahong.model.user.User;
import com.hanyahong.model.user.vo.LoginVO;
import com.hanyahong.repo.impl.UserRepoImpl;
import com.hanyahong.service.UserService;
import com.hanyahong.util.DateUtil;
import com.hanyahong.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Administrator on 2017/1/22.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepoImpl repo;

    @Override
    public User selUserService(String id) {
        return repo.selUserRepoAllInfo(id);
    }

    @Override
    public void updateUserService(String id) {
//        repo.addUserRepo()
    }

    @Override
    public void addUserService(User user) {
        repo.addUserRepo(user);
    }

    @Override
    public StatusInfo userLoginService(LoginVO loginVO) {
        StatusInfo statusInfo = new StatusInfo();
        User user = repo.selUserRepoOneByPhone(loginVO.getPhone());
        if (null != user) {
            if (loginVO.getPassword().equals(user.getPassword())) {
                statusInfo.setStatus("登录成功");
                statusInfo.setToken(user.getToken());
                statusInfo.setId(user.getId());
            } else {
                statusInfo.setStatus("密码错误");
            }
        } else {
            statusInfo.setStatus("用户不存在");
        }
        return statusInfo;
    }

    @Override
    public StatusInfo userRegisterService(LoginVO loginVO) {
        StatusInfo statusInfo = new StatusInfo();

        //查询是否注册
        if (loginVO.getPhone() != null && loginVO.getPassword() != null) {
            User user = repo.selUserRepoOneByPhone(loginVO.getPhone());
            if (user == null) {
                //如果为空，创建用户
                User user1 = new User();
                user1.setId(RandomUtil.createRandomVcode() + loginVO.getPhone());
                user1.setDate(new Date());
                user1.setPhone(loginVO.getPhone());
                user1.setPassword(loginVO.getPassword());
                user1.setLast_login_time(DateUtil.getCurrentTime());
            } else {
                statusInfo.setStatus("该电话已被注册");
            }
        } else {
            statusInfo.setStatus("电话密码不能为空");
        }
        return statusInfo;
    }
}


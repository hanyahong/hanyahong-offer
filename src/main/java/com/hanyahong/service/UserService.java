package com.hanyahong.service;

import com.hanyahong.model.StatusInfo;
import com.hanyahong.model.user.User;
import com.hanyahong.model.user.vo.LoginVO;
import org.springframework.stereotype.Service;

/**
 * Created by hyh on 17-1-13.
 * 用户服务层接口
 */
@Service
public interface UserService {

    /**
     * 查询用户
     *
     * @param id
     */
    User selUserService(String id);

    /**
     * 修改用户
     *
     * @param id
     */
    void updateUserService(String id);

    /**
     * 新增用户
     *
     * @param user
     */
    void addUserService(User user);

    /**
     * 用户登录
     *
     * @param loginVO
     * @return
     */
    StatusInfo userLoginService(LoginVO loginVO);

    /**
     * 用户注册
     * @param loginVO
     * @return
     */
    StatusInfo userRegisterService(LoginVO loginVO);
}

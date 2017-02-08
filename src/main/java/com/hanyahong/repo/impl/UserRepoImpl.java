package com.hanyahong.repo.impl;


import com.hanyahong.model.user.Account;
import com.hanyahong.model.user.User;
import com.hanyahong.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/1/22.
 * 用户资源操作类
 */
@Repository
public class UserRepoImpl {

    @Autowired
    private MongoTemplate mongoTemplate;

    //增加&修改
    public Integer addUserRepo(User user) {
        try {
            mongoTemplate.save(user);
        } catch (Exception e) {
            return Integer.valueOf(0);
        }
        return Integer.valueOf(1);
    }

    //查询
    public User selUserRepoAllInfo(String id) {
        return mongoTemplate.findOne(new Query(Criteria.where("_id").is(id)), User.class, "user");
    }

    //查询基本信息
    public User selUserRepoMainInfo(String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        query.fields().exclude("account");
        return this.mongoTemplate.findOne(query, User.class, "user");
    }

    //查询账号信息
    public Account selUserRepoAccount(String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        User user = this.mongoTemplate.findOne(query, User.class, "user");
        Account account = null;
        if (user != null) {
            account = user.getAccount();
        }
        return account;
    }


}

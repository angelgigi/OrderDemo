package com.ctrip.order.service;

import com.ctrip.order.dao.UserDao;
import com.ctrip.order.model.UserEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by angelqiqi on 2017/3/16.
 */
@Service
@Scope("request")
public class UserServiceImp implements UserService {

    @Resource
    private UserDao userDao;

    public UserEntity GetUserInfo(String username) {
        return userDao.GetUserInfo(username);
    }

    public int register(UserEntity userEntity) {
        return userDao.register(userEntity);
    }

   public List<UserEntity> GetUserList()
   {
       return userDao.GetUserList();
   }

    public UserEntity GetUserInfo(int id) {
        return userDao.GetUserInfo(id);
    }

    public int UpdateUser(UserEntity userEntity) {
        return userDao.UpdateUser(userEntity);
    }

    public int deleteUser(int id) {
        return userDao.deleteUser(id);
    }
}

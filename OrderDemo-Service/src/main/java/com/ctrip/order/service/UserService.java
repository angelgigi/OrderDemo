package com.ctrip.order.service;

import com.ctrip.order.model.UserEntity;

import java.util.List;

/**
 * Created by angelqiqi on 2017/3/16.
 */
public interface UserService {
    UserEntity GetUserInfo(String username);

    int register(UserEntity userEntity);

    List<UserEntity> GetUserList();

    UserEntity GetUserInfo(int id);
    int UpdateUser(UserEntity userEntity);
    int deleteUser(int id);
}

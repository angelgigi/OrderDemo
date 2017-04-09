package com.test.order.dao;

import com.test.order.model.UserEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by angelqiqi on 2017/3/16.
 */
@Repository
public class UserDaoImp implements UserDao {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session;

    // 注入一个SqlSessionFactory，这里通过构造函数注入
    public UserDaoImp() {
        java.lang.String resource = "mybatis/mybatis-config.xml";
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            session = sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public UserEntity GetUserInfo(String username) {
        UserEntity userEntity=new UserEntity();
        userEntity=session.selectOne("UserDao.GetUserInfo",username);
        return userEntity;
    }

    public int register(UserEntity userEntity) {
        int result= session.insert("UserDao.register",userEntity);
        session.commit();
        return result;
    }

    public List<UserEntity> GetUserList()
    {
        List<UserEntity> list=new ArrayList<UserEntity>();
        list = session.selectList("com.ctrip.order.dao.UserDao.selectUserList");
        return list;
    }

    public UserEntity GetUserInfo(int id) {
        UserEntity userEntity=new UserEntity();
        userEntity=session.selectOne("com.ctrip.order.dao.UserDao.GetUserInfoidByid",id);
        return userEntity;
    }

    public int UpdateUser(UserEntity userEntity) {
        int result= session.update("com.ctrip.order.dao.UserDao.updateUser",userEntity);
        session.commit();
        return result;
    }

    public int deleteUser(int id) {
        int result= session.update("com.ctrip.order.dao.UserDao.deleteUser",id);
        session.commit();
        return result;
    }

}

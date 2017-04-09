package com.test.order.dao;

import com.test.order.model.CityEntity;
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
 * Created by lukuanpc on 2016/12/25.
 */
@Repository
public class CityDaoImp implements CityDao {

    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session;



    // 注入一个SqlSessionFactory，这里通过构造函数注入
    public CityDaoImp() {
        String resource = "mybatis/mybatis-config.xml";
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            session = sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int GetCityCount() {
        int count = session.selectOne("com.test.order.dao.CityDao.selectCount");

        return count;
    }

    public List<CityEntity> GetCityList() {
        List<CityEntity> list=new ArrayList<CityEntity>();
        list = session.selectList("com.test.order.dao.CityDao.selectCityList");
        return list;
    }

    public CityEntity GetCityInfo(int id) {
        CityEntity cityEntity=new CityEntity();
        cityEntity=session.selectOne("com.test.order.dao.CityDao.GetCityInfo",id);
        return cityEntity;
    }



    public int UpdateCity(CityEntity cityEntity)
    {
        int result= session.update("com.test.order.dao.CityDao.updateCity",cityEntity);
        session.commit();
        return result;

    }

    public int deleteCity(int id)
    {
        int result= session.update("com.test.order.dao.CityDao.deleteCity",id);
        session.commit();
        return result;

    }

    public int addCity(CityEntity cityEntity)
    {
        int result= session.insert("com.test.order.dao.CityDao.addCity",cityEntity);
        session.commit();
        return result;

    }
};

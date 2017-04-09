package com.test.order.dao;

import com.test.order.model.CityEntity;

import java.util.List;

/**
 * Created by lukuanpc on 2016/12/25.
 */
public interface CityDao {
    int GetCityCount();
    List<CityEntity> GetCityList();
    CityEntity GetCityInfo(int id);
    int UpdateCity(CityEntity cityEntity);
    int deleteCity(int id);
    int addCity(CityEntity cityEntity);

}

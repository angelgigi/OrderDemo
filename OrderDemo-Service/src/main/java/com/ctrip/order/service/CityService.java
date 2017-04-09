package com.ctrip.order.service;

import com.ctrip.order.model.CityEntity;

import java.util.List;

/**
 * Created by lukuanpc on 2016/12/25.
 */
public interface CityService {
    int GetCityCount();
    List<CityEntity> getCityList();
    CityEntity  GetCityInfo(int id);
    int UpdateCity(CityEntity cityEntity);
    int deleteCity(int id);
    int addCity(CityEntity cityEntity);
}

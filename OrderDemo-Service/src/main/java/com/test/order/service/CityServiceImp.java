package com.test.order.service;

import com.test.order.dao.CityDao;
import com.test.order.model.CityEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lukuanpc on 2016/12/25.
 */
@Service
@Scope("request")
public class CityServiceImp implements CityService {

    @Resource
    private CityDao cityDao;

    public int GetCityCount() {
        return cityDao.GetCityCount();
    }

    public List<CityEntity> getCityList() {

        List<CityEntity> list=cityDao.GetCityList();
//        for (CityEntity cc:list
//             ) {
//
//            if(cc.getId()>5)
//            {
//                cc.setDistrict("二线城市");
//            }
//            else
//            {
//                cc.setDistrict("一线城市");
//            }
//
//        }
        return list;
    }



    public CityEntity GetCityInfo(int id) {
        return cityDao.GetCityInfo(id);
    }


    private List<CityEntity> upDateCityInfo(List<CityEntity> list){
        for (CityEntity wq:list
             ) {
                 if (wq.getId()>5){
                     wq.setName("yangLukuan");
                 }
                 else
                 {
                     wq.setName("wangQi");
                 }
        }
        return list;
    }

    public int UpdateCity(CityEntity cityEntity)
    {
       return    cityDao.UpdateCity(cityEntity);
    }

    public  int deleteCity(int id)
    {
        return  cityDao.deleteCity(id);
    }

    public int addCity(CityEntity cityEntity)
    {
        return cityDao.addCity(cityEntity);
    }

}

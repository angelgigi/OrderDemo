package com.ctrip.order.service.test;

import com.ctrip.order.dao.CityDao;
import com.ctrip.order.dao.CityDaoImp;
import com.ctrip.order.service.CityService;
import com.ctrip.order.service.CityServiceImp;
import org.junit.Test;

/**
 * Created by lukuanpc on 2016/12/25.
 */
public class CityServiseTest {

    @Test
    public void getNumtest()
    {
        CityService orderDao=new CityServiceImp();
        int num= orderDao.GetCityCount();
        System.out.print(num);
        //Assert.assertEquals(4081,num);
    }
}

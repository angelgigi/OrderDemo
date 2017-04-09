package com.test.order.service.test;

import com.test.order.service.CityService;
import com.test.order.service.CityServiceImp;
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

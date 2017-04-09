package com.test.order.dao.test;

import com.test.order.dao.CityDao;
import com.test.order.dao.CityDaoImp;
import org.junit.Test;

/**
 * Created by lukuanpc on 2016/12/25.
 */
public class CityDaoTest {
    @Test
    public void getNumtest()
    {
        CityDao orderDao=new CityDaoImp();
        int num= orderDao.GetCityCount();
        System.out.print(num);
        //Assert.assertEquals(4081,num);
    }
}

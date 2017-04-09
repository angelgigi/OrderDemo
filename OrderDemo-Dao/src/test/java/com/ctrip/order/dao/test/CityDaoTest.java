package com.ctrip.order.dao.test;

import com.ctrip.order.dao.CityDao;
import com.ctrip.order.dao.CityDaoImp;
import org.junit.Test;
import org.springframework.util.Assert;

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

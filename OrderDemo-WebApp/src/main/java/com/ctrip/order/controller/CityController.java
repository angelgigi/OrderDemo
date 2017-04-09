package com.ctrip.order.controller;

import com.ctrip.order.model.CityEntity;
import com.ctrip.order.service.CityService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by lukuanpc on 2016/12/25.
 */
@RequestMapping("/city")
@Controller
@Scope("request")
public class CityController  {
    //service类
    @Resource
    private CityService cityService;

    @RequestMapping("/citylist")
    public ModelAndView citylist() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        List<CityEntity> list=cityService.getCityList();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("/city/citylist");
        return modelAndView;
    }


    @RequestMapping("/city")
    public ModelAndView city(int id) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        CityEntity entity=cityService.GetCityInfo(id);
        modelAndView.addObject("entity",entity);
        modelAndView.setViewName("/city/city");
        return modelAndView;
    }

    @RequestMapping(value = "/getcitylist",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,List<CityEntity>> cityList() throws Exception {
        Map<String,List<CityEntity>> map= new HashMap<String, List<CityEntity>>();

        List<CityEntity> list=cityService.getCityList();
        map.put("list",list);
        return map;
    }

    @RequestMapping(value = "/updateCity",method = RequestMethod.POST)
    @ResponseBody
    public int updateCity(@RequestBody CityEntity city) throws Exception {
        if(city!=null)
        {
        return cityService.UpdateCity(city);
        }
        else
        {return  0;}

    }

    @RequestMapping(value = "/addCity",method = RequestMethod.POST)
    @ResponseBody
    public int addCity(@RequestBody CityEntity city) throws Exception {
        if(city!=null)
        {
            return cityService.addCity(city);
        }
        else
        {return  0;}

    }

    @RequestMapping(value = "/deleteCity",method = RequestMethod.POST)
    @ResponseBody
    public int deleteCity(@RequestBody int id) throws Exception {
        if(id>0)
        {
            return cityService.deleteCity(id);
        }
        else
        {return  0;}

    }

    @RequestMapping("/list")
    public ModelAndView list() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/city/list");
        return modelAndView;
    }


    @RequestMapping(value = "/addlist",method = RequestMethod.GET)
    public ModelAndView addlist() throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("/city/addlist");
        return modelAndView;
    }


    @RequestMapping(value = "/editcity",method = RequestMethod.GET)
    public ModelAndView editcity(int id) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        CityEntity cc=new CityEntity();
        cc.setId(id);
        modelAndView.addObject("city",cc);
        modelAndView.setViewName("/city/editcity");
        return modelAndView;
    }

    @RequestMapping(value = "/getcityInfo",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,CityEntity> getcityInfo(@RequestBody int id) throws Exception {
        Map<String,CityEntity> map= new HashMap<String,CityEntity>();

        CityEntity city=cityService.GetCityInfo(id);
        map.put("city",city);
        return map;
    }




//    @RequestMapping(value = "/addlist",method = RequestMethod.GET)
//    public ModelAndView addlist() throws Exception {
//        ModelAndView modelAndView = new ModelAndView();
//
//        modelAndView.setViewName("/city/addlist");
//        return modelAndView;
//    }
}

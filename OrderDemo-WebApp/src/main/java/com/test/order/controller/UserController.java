package com.test.order.controller;

import com.test.order.model.UserEntity;
import com.test.order.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by angelqiqi on 2017/3/22.
 */
@RequestMapping("/user")
@Controller
@Scope("request")
public class UserController {
    @Resource
    private UserService userService;


    //方法
    @RequestMapping(value = "/getuserlist",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,List<UserEntity>> cityList() throws Exception {
        Map<String,List<UserEntity>> map= new HashMap<String, List<UserEntity>>();

        List<UserEntity> list=userService.GetUserList();
        map.put("list",list);
        return map;
    }


    //显示界面
    @RequestMapping("/userlist")
    public ModelAndView userlist() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user/userlist");
        return modelAndView;
    }


    //显示一个用户 界面
    @RequestMapping("/user")
    public ModelAndView user(int id) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        UserEntity entity=userService.GetUserInfo(id);
        modelAndView.addObject("entity",entity);
        modelAndView.setViewName("/user/user");
        return modelAndView;
    }


    //更新 显示页面
    @RequestMapping(value = "/edituser",method = RequestMethod.GET)
    public ModelAndView editusery(int id) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        UserEntity cc=new UserEntity();
        cc.setId(id);
        modelAndView.addObject("user",cc);
        modelAndView.setViewName("/user/edituser");
        return modelAndView;
    }




    //删除 方法
    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    @ResponseBody
    public int deleteUser(@RequestBody int id) throws Exception {
        if(id>0)
        {
            return userService.deleteUser(id);
        }
        else
        {return  0;}

    }

    //更新 方法
    @RequestMapping(value = "/updateCity",method = RequestMethod.POST)
    @ResponseBody
    public int updateCity(@RequestBody UserEntity user) throws Exception {
        if(user!=null)
        {
            return userService.UpdateUser(user);
        }
        else
        {return  0;}

    }

    //获取一条记录  方法
    @RequestMapping(value = "/getuserInfo",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,UserEntity> getcityInfo(@RequestBody int id) throws Exception {
        Map<String,UserEntity> map= new HashMap<String,UserEntity>();

        UserEntity user=userService.GetUserInfo(id);
        map.put("user",user);
        return map;
    }





}

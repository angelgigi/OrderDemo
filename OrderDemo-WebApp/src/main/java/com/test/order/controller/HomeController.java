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
import java.util.Map;

/**
 * Created by lukuanpc on 2017/1/9.
 */
@Controller
@Scope("request")
public class HomeController {

    @Resource
    private UserService userService;


    @RequestMapping("/login")
    public ModelAndView citylist() throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("login");
        return modelAndView;
    }


    @RequestMapping(value = "/dologin",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,String> cityList(@RequestBody UserEntity user) throws Exception {
        Map<String,String> map= new HashMap<String,String>();

        if(user==null || user.getUserName()==null || user.getPassWord()==null)
        {
            map.put("result","参数不能为空");
            return map;
        }

        UserEntity en=userService.GetUserInfo(user.getUserName());
        if(en==null)
        {
            map.put("result","用户不存在");
        }
        else
        {
            if(en.getPassWord().equals(user.getPassWord()))
            {
                map.put("result","OK");
            }
            else {
                map.put("result","登录失败");
            }
        }
        return map;

    }


    @RequestMapping("/register")
    public ModelAndView register() throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("register");
        return modelAndView;
    }


    @RequestMapping(value="/register",method = RequestMethod.POST)
    @ResponseBody
    public int addUser(@RequestBody UserEntity user) throws Exception {
        if(user!=null)
        {
            return userService.register(user);
        }
        else
        {
            return  0;
        }
    }


}

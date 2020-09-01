package com.beeb.myspringboot.controller;

import com.alibaba.fastjson.JSON;
import com.beeb.myspringboot.model.User;
import com.beeb.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

/**
 * <dl>
 * <dd>CreateDate: 2020/3/23</dd>
 * </dl>
 *
 * @author lzh
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

    @PostMapping("/getUserByAge")
    public User getUserByAge(@RequestBody String data){
        Map<String,Object> map=JSON.parseObject(data);
        User user=userService.getOne(Integer.valueOf(map.get("age").toString()));
        return user;
    }

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody String data){
        User user=new User();
        user.setId("saf");
        user.setAge(17);
        user.setCertNo("151511162");
        user.setSex("1");
        user.setName("wvwa");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        userService.saveUser(user);
        return user.getName();
    }
}

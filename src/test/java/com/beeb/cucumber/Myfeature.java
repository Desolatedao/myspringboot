package com.beeb.cucumber;

import com.beeb.myspringboot.model.User;
import com.beeb.myspringboot.service.UserService;
import cucumber.api.java.en.Given;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * <dl>
 * <dd>CreateDate: 2020/3/25</dd>
 * </dl>
 *
 * @author lzh
 */
@Slf4j
public class Myfeature{
    @Resource(name = "userService")
    private UserService userService;

    @Given("^step one$")
    public void stepOne() {
        User user = userService.getOne(18);
        System.out.println(user.getCertNo());
        System.out.println("===");
    }

    @Given("^finish$")
    public void finish() {
        System.out.println("finish");
    }
}

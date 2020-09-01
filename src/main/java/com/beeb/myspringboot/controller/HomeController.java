package com.beeb.myspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <dl>
 * <dd>CreateDate: 2020/7/27</dd>
 * </dl>
 *
 * @author lzh
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "home";
    }
}

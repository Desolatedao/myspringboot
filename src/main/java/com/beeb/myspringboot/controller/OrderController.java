package com.beeb.myspringboot.controller;

import com.beeb.myspringboot.bean.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <dl>
 * <dd>CreateDate: 2020/7/27</dd>
 * </dl>
 *
 * @author lzh
 */
@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("current")
    public String orderForm(Model model){
        model.addAttribute("order",new Order());
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid Order order, Errors errors){
        if(errors.hasErrors()){
            return "orderForm";
        }
        log.info("Order submitted:"+order);
        return "redirect:/";
    }
}

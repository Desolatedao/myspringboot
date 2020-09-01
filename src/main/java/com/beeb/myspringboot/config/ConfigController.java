package com.beeb.myspringboot.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("config")
public class ConfigController {
    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private String useLocalCache;

    @NacosValue(value = "${testKey:null}", autoRefreshed = true)
    private String testKey;

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public String get() {
        return useLocalCache;
    }

    @RequestMapping(value = "/getTest", method = GET)
    @ResponseBody
    public String getTest() {
        return testKey;
    }
}
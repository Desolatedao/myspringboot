package com.beeb.myspringboot;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "gateway_test",groupId = "gateway_group",autoRefreshed = true)
@MapperScan("com.beeb.myspringboot.mapper")
public class MyspringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyspringbootApplication.class, args);
    }
}

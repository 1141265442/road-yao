package com.xlwang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.xlwang.modular.mapper")
public class RoadYaoApplication {
    public static void main(String[] args) {
        //TODO 为什么此处使用反射就可以直接启动项目了？
        SpringApplication.run(RoadYaoApplication.class);
    }
}

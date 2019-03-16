package com.monco;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName HomeApplication
 * @Description 启动类
 * @Author monco
 * @Date 2019/3/5 19:11
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan("com.monco.mapper")
public class HomeApplication {
    public static void main(String[] args) {
        SpringApplication.run(HomeApplication.class, args);
    }
}

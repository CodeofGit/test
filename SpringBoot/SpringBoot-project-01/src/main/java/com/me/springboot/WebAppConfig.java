package com.me.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: WebAppConfig
 * @Author:
 * @Date: 2021/1/20 16:26
 * @Version: 1.0
 * @Description:
 **/
@SpringBootApplication
public class WebAppConfig {
    /**
     * 该函数为SpringBoot的主函数，也是SpirngBoot项目的入口和启动器
     * @param args
     */
    public static void main(String[] args) {
        //启动SpringBoot
        //参数为SpringBoot的核心配置类
        SpringApplication.run(WebAppConfig.class);
    }
}

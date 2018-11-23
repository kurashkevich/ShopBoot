package com.completeboot.course;

import com.completeboot.course.config.MyAppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;


@SpringBootApplication
@EnableConfigurationProperties
public class ShopBootApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ShopBootApplication.class, args);

        String[] beanNames = applicationContext.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String name : beanNames) {
            System.out.println(name);
        }
        //asdads

        MyAppConfig config = (MyAppConfig)applicationContext.getBean("myAppConfig");
        System.out.println(config.toString());


    }
}

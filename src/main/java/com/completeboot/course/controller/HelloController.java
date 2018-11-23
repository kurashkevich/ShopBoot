package com.completeboot.course.controller;

import com.completeboot.course.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private NotificationService notificationService;

    @Value("${helloController.msg}")
    private String helloControllerMsg;

    @Autowired
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @RequestMapping("/say")
    public String sayHello(){
        return helloControllerMsg;
    }


}

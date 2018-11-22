package com.completeboot.course.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "my-app-config")
public class MyAppConfig {

    //@Value("${myAppConfig.appName}")
    private String appName;
    //@Value("${myAppConfig.appDescription}")
    private String appDescription;
    //@Value("${myAppConfig.adminFirstName}")
    private String adminFirstName;
    //@Value("${myAppConfig.adminLastName}")
    private String adminLastName;
    //@Value("${myAppConfig.adminEmail}")
    private String adminEmail;

    @Override public String toString() {
        return "MyAppConfig{" + "appName='" + appName + '\'' + ", appDescription='" + appDescription + '\''
            + ", adminFirstName='" + adminFirstName + '\'' + ", adminLastName='" + adminLastName + '\''
            + ", adminEmail='" + adminEmail + '\'' + '}';
    }
}

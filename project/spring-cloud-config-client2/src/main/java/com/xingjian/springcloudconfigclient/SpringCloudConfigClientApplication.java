package com.xingjian.springcloudconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.reactive.context.StandardReactiveWebEnvironment;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class SpringCloudConfigClientApplication {

    public static void main(String[] args) throws IOException {

        //SpringApplication application = new SpringApplication(SpringCloudConfigClientApplication.class);
        //application.setEnvironment(new StandardReactiveWebEnvironment());
        //application.run(args);
        SpringApplication.run(SpringCloudConfigClientApplication.class, args);
        //System.in.read();
    }

}

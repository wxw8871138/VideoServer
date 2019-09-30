package com.nus.cs5248.team2.videoServer.videoServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class VideoServerApplication extends SpringBootServletInitializer {
//public class VideoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoServerApplication.class, args);
    }

}

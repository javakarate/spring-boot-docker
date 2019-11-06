package com.nc.springbootdocker;

import com.nc.utils.LogUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication(scanBasePackages={"com.nc.springbootdocker", "controller"})
@RestController
public class SpringBootDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }

    @RequestMapping(value = "/greeting")
    public String getGreeting(){
        return LogUtil.getCurrentDateTime() +  "Hello from SB, with random number:" + getRandomValue();
    }

    @RequestMapping(value = "/random")
    public String getRandomValueAtCurrentTime(){
        return LogUtil.getCurrentDateTime() + " Getting random number:" + getRandomValue();
    }

    public int getRandomValue(){
        Random random = new Random();
        return random.nextInt(99999);
    }
}
package com.firat.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {


    private final EurekaFeignClient eurekaClient;

    public AccountController(EurekaFeignClient eurekaClient) {
        this.eurekaClient = eurekaClient;
    }


    @GetMapping("/")
    public String hello(){
        return eurekaClient.hello();
    }
}

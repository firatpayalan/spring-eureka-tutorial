package com.firat.account;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client")
public interface EurekaFeignClient {

    @RequestMapping("/")
    String hello();
}

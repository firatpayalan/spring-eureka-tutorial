package com.firat.account;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("account-client")
public interface EurekaFeignClient {

    @RequestMapping("/")
    String hello();
}

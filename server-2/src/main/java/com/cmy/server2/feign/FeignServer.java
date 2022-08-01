package com.cmy.server2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "server-1")
public interface FeignServer {

    @GetMapping("/hello/say")
    String sayHello();
}

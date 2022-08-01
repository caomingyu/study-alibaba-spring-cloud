package com.cmy.server2.controller;

import cn.hutool.core.util.StrUtil;
import com.cmy.server2.feign.FeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cao.mingyu
 * @date 2022/7/23
 */
@RequestMapping("/test")
@RestController
@RefreshScope
public class TestController {
    @Autowired
    FeignServer feignServer;
    @Value("${cmy.test}")
    private String test;

    @GetMapping("/1")
    public String test1() {
        return StrUtil.concat(false, "hello, my is server-2, from server-1 is ", feignServer.sayHello(), "  " + test);
    }
}

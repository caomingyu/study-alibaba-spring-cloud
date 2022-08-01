package com.cmy.server1.controll;

import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cao.mingyu
 * @date 2022/7/23
 */
@RequestMapping("/testgateway")
@RestController
public class ApiController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/say")
    public String say(){
        return StrUtil.concat(false,"hello, proxy gateway my is ", port);
    }
}

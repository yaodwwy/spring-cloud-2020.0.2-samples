package com.example.clienta;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class VersionController {

    @Value("${server.port}")
    String port;

    @Value("${foo}")
    String foo;

    @RequestMapping("/home")
    public String home(@RequestParam(required = false) String name) {
        return "hi " + (name != null ? name : "name 参数 未输入吧！") + ",i am from port:" + port;
    }

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}

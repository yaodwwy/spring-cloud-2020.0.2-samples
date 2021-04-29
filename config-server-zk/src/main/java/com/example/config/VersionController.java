package com.example.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RefreshScope
@Controller
public class VersionController {

    @Value("${server.port}")
    String port;

    @Value("${foo}")
    String foo;

    @ResponseBody
    @RequestMapping("/home")
    public String home(@RequestParam(required = false) String name) {
        return "hi " + (name != null ? name : "name 参数 未输入吧！") + ",i am from port:" + port;
    }

    @RequestMapping(value = "/")
    public String hi() {
        log.info("info foo: {}", foo);
        log.debug("debug foo: {}", foo);
        log.warn("warn foo: {}", foo);
        log.error("error foo: {}", foo);
        return "/foo/dev";
    }
}

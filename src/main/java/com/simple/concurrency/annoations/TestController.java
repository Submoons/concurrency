package com.simple.concurrency.annoations;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by simple on 2018/6/6.
 */
@Controller
@Slf4j
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}

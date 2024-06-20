package com.shihaohu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shihaohu
 * @date 2024/6/20 21:19
 */
@Controller
@RequestMapping("hello")
public class HelloController {
    @RequestMapping("hi")
    public String hi() {
        return "hello";
    }
}

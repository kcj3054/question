package com.example.demo.thymeleaf.basic;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class BasicController {


    @GetMapping("/text-basic")
    public String textBasic(Model model) {
        model.addAttribute("data", "Hello kcj");
        return "basic/text-basic";
    }


    @GetMapping("/text-unescaped")
    public String textUnescaped(Model model) {
        model.addAttribute("data", "hello <b> kcj </b>");
        return "basic/text-unescaped";
    }
}

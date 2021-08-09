package com.example.demo.domain;


import lombok.AllArgsConstructor;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//잘돌아가나 확인할려고
//@Controller == component
@RestController
@Component
@RequestMapping("/user")
@AllArgsConstructor
public class test {



    @RequestMapping
    public String findUser(Model model) {

        model.addAttribute("add", "ad");

        return "ok";
    }

    @GetMapping("/test-bean")
    public TestBean testBean(){
            return new TestBean("hello test");
    }

    @GetMapping("/path/{name}")
    public TestBean testBean(@PathVariable String name) {
        return new TestBean(String.format("hello %s", name));
    }

}

package com.example.testspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: testspringboot
 * @DESCRIPTION:
 * @USER: lxs
 * @DATE: 2022/5/11 22:41
 */
@RestController
@RequestMapping("person")
public class PersonAction {
    @RequestMapping("m1")
    public String m2(){
        return "xiaoyu";

    }
    public Person m3() {
        return new Person("xiaoming", 1);
    }
}


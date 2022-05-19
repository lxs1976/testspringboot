package com.example.testspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: testspringboot
 * @DESCRIPTION:
 * @USER: lxs
 * @DATE: 2022/5/12 0:22
 */

/**
 * @controller 写在类上方, 方法返回的是网页
 * @requestmapping 请求映射, 访问路径, 写在类的上方和方法的上方
 * @ResponseBody 将后端对象数据转为json数据
 * @RestController 卸载类上方 控制层注解 就是requestmapping+controller
 */
@Controller
@RestController
@RequestMapping("action03")
public class action03 {

    @RequestMapping("m1")
    public String m1() {
        return "redirect:/a.html";
    }
    @RequestMapping("m2")
    public String m2() {
        return "redirect:/b.html";
    }
    @RequestMapping("m3")

    public Person m3() {
        return new Person("李先生", 24);
    }

}

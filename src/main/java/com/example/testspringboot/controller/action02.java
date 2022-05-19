package com.example.testspringboot.controller;

/**
 * @PROJECT_NAME: testspringboot
 * @DESCRIPTION:
 * @USER: lxs
 * @DATE: 2022/5/11 23:58
 */

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 后端获取参数的分类
 * 1 多个参数(参数少): 和前台发送数据个数,类型一致
 * 2 封装类(参数多) : 必须和类中的 成员变量的 个数类型 相同
 * 3 map集合(灵活,多变)
 */
@RequestMapping("action02")
@RestController
public class action02 {
    @RequestMapping("m1")
    public String m1(String name, int age) {
        System.out.println(name);
        System.out.println(age);
        return "";
    }

    @RequestMapping("m2")
    public String m2(Person person) {

        System.out.println(person);
        return "111";
    }

    @RequestMapping("m3")
    public String m3(@RequestBody Map<String,Object>map) {
        System.out.println(map);
        return "1222";
    }
}

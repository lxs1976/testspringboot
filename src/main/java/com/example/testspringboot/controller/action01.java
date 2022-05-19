package com.example.testspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @PROJECT_NAME: testspringboot
 * @DESCRIPTION:
 * @USER: lxs
 * @DATE: 2022/5/11 22:43
 */

/**
 * springmvc返回类型
 * 字符串
 * 对象
 * list集合
 * map集合
 */
@RestController
@RequestMapping("/action")
public class action01 {
    @RequestMapping("/m1")
    public String m01() {
        return "zhangsan";
    }
    @RequestMapping("/m2")
    public Person m02() {
        return new Person("小霞", 1);
    }
    @RequestMapping("/m3")
    public List<Person> m03() {
        Person p1 = new Person("小王", 2);
        Person p2 = new Person("小李", 3);
        List<Person> personArrayList = new ArrayList<>();
        personArrayList.add(p2);
        personArrayList.add(p1);
        return personArrayList;
    }
    @RequestMapping("/m4")
    public Map<String, Object> m04() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "zhangsan");
        map.put("person", new Person("张三", 18));

        Person p1 = new Person("小天", 2);
        Person p2 = new Person("小饭", 3);
        List<Person> personArrayList = new ArrayList<>();
        personArrayList.add(p2);
        personArrayList.add(p1);
        map.put("list", personArrayList);
        return map;


    }
}

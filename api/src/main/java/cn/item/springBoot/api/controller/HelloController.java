package cn.item.springBoot.api.controller;

import cn.item.springBoot.core.service.HelloService;
import cn.item.springBoot.domain.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String Hello(){
        return "hello java";
    }

    @GetMapping("/sayHello")
    public String sayHello(){
        String sayHello = helloService.sayHello();
        return sayHello;
    }

    @GetMapping("/list")
    public List<UserRole> list(){
        List<UserRole> list = helloService.list();
        return list;
    }
}

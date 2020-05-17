package com.wjl.system.controller;

import com.wjl.server.mapper.TestMapper;
import com.wjl.server.model.Test;
import com.wjl.server.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings("all")
@RestController
public class HelloController {

    @Autowired
    private TestService testService;


    @GetMapping("sayhello")
    public List<Test> sayHell() {
        List<Test> list = testService.list();
        return list;
    }


}

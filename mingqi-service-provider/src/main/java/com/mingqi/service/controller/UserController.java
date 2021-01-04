package com.mingqi.service.controller;

import com.mingqi.service.domain.User;
import com.mingqi.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Integer id) {
        return this.userService.queryById(id);
    }
}

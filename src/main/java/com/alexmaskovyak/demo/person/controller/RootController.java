package com.alexmaskovyak.demo.person.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
    @RequestMapping("/")
    String home() {
        return "home";
    }
    
    @RequestMapping("/restricted")
    @PreAuthorize("hasRole(@roles.ADMIN)")
    String restricted() {
        return "restricted";
    }
}
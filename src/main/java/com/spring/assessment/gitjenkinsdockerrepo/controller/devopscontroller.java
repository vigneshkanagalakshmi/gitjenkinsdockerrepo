package com.spring.assessment.gitjenkinsdockerrepo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class devopscontroller {
    @GetMapping("/hellodevops")
    public String getNames() {
        return ( "Welcome to Dockers and K8S, Jenkins ");
    }
}

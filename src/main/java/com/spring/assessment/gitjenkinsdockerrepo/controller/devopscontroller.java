package com.spring.assessment.gitjenkinsdockerrepo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class devopscontroller {
    @GetMapping("/assesstestdevops")
    public String getNames() {
        return ( " Git Jenkins Docker Repo Simplilearn_PGPDO Cohort June 202 Vignesh ");
    }
}

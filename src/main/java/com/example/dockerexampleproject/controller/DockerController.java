package com.example.dockerexampleproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("/welcome")
    public String introPK() {
        return "THIS APPLICATION IS RUNNING FROM DOCKER CONTAINER";
    }


}

package com.example.admin_project.controller;

import com.example.admin_project.model.network.Header;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GetController {

    @GetMapping("/header")
    public Header getHeader(){
        // {"resultCode: "OK", "description: "OK"}
        return Header.builder().resultCode("OK").description("OK").build();
    }
}

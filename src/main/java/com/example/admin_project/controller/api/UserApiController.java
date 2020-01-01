package com.example.admin_project.controller.api;

import com.example.admin_project.controller.CrudController;
import com.example.admin_project.model.network.request.UserApiRequest;
import com.example.admin_project.model.network.response.UserApiResponse;
import com.example.admin_project.service.UserApiLogicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController extends CrudController<UserApiRequest, UserApiResponse> {

    @Autowired
    private UserApiLogicService userApiLogicService;

    @PostConstruct
    public void init(){
        this.baseService = userApiLogicService;
    }
}

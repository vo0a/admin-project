package com.example.admin_project.controller.api;

import com.example.admin_project.controller.CrudController;
import com.example.admin_project.model.network.request.OrderGroupApiRequest;
import com.example.admin_project.model.network.response.OrderGroupApiResponse;
import com.example.admin_project.service.OrderGroupApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/orderGroup")
public class OrderGroupApiController extends CrudController<OrderGroupApiRequest, OrderGroupApiResponse> {

    private final OrderGroupApiLogicService orderGroupApiLogicService;

    @PostConstruct
    public void init(){
        this.baseService = orderGroupApiLogicService;
    }
}

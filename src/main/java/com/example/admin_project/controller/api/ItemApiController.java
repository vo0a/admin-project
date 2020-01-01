package com.example.admin_project.controller.api;

import com.example.admin_project.controller.CrudController;
import com.example.admin_project.model.network.request.ItemApiRequest;
import com.example.admin_project.model.network.response.ItemApiResponse;
import com.example.admin_project.service.ItemApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/item")
public class ItemApiController extends CrudController<ItemApiRequest, ItemApiResponse> {

    @Autowired
    private ItemApiLogicService itemApiLogicService;

    @PostConstruct
    public void init(){
        this.baseService = itemApiLogicService;
    }
}

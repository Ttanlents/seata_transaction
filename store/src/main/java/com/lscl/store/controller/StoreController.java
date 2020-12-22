package com.lscl.store.controller;

import com.lscl.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    @Autowired
    private StoreService storeService;

    @RequestMapping("/updateCount/{flag}")
    public String updateCount(@PathVariable Integer flag){
        storeService.updateCount(flag);

        return "store...success";
    }
}

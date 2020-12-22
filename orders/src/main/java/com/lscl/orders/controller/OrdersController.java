package com.lscl.orders.controller;

import com.lscl.orders.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/updateCount/{flag}")
    public String updateCount(@PathVariable Integer flag){

        ordersService.updateCount(flag);

        return "orders...success";
    }
}

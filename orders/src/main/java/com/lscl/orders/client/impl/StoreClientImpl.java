package com.lscl.orders.client.impl;

import com.lscl.orders.client.StoreClient;
import org.springframework.stereotype.Component;

@Component
public class StoreClientImpl implements StoreClient {

    public String updateCount(Integer flag) {
        return "no";
    }
}

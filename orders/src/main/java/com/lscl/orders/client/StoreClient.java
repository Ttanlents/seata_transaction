package com.lscl.orders.client;

import com.lscl.orders.client.impl.StoreClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "store",fallback = StoreClientImpl.class)
public interface StoreClient {

    @RequestMapping("/store/updateCount/{flag}")
    public String updateCount(@PathVariable("flag") Integer flag);

}

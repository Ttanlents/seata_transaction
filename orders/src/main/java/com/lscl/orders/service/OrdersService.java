package com.lscl.orders.service;

import com.lscl.orders.client.StoreClient;
import com.lscl.orders.dao.OrdersDao;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrdersService {
    @Autowired
    private OrdersDao ordersDao;

    @Autowired
    private StoreClient storeClient;

    @Transactional
    @GlobalTransactional            // 开启全局事务
    public void updateCount(Integer flag) {
        System.out.println("orders_xid: "+RootContext.getXID());
        // 订单+1
        ordersDao.updateCount();

        // 库存-1
        String msg = storeClient.updateCount(flag);

        if("no".equals(msg)){
            throw new RuntimeException("store...error");
        }

        System.out.println(msg);

        if (flag == 100) {
            throw new RuntimeException("orders...error");
        }
    }
}

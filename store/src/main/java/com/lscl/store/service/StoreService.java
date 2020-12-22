package com.lscl.store.service;

import com.lscl.store.dao.StoreDao;
import io.seata.core.context.RootContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StoreService {
    @Autowired
    private StoreDao storeDao;


    @Transactional
    public void updateCount(Integer flag) {
        System.out.println("orders_xid: "+ RootContext.getXID());

        // 库存-1
        storeDao.updateCount();

        if(flag==200){			// 模拟异常
            throw new RuntimeException("store...error");
        }

    }
}

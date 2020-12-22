package com.lscl.orders.dao;

import com.lscl.orders.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersDao extends JpaRepository<Orders,String> {
    @Query("update Orders o set o.count=o.count+1")
    @Modifying
    void updateCount();

}

package com.lscl.store.dao;

import com.lscl.store.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDao extends JpaRepository<Store,String> {
    @Query("update Store s set s.count=s.count-1")
    @Modifying
    void updateCount();

}

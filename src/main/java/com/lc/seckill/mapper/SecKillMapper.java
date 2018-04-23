package com.lc.seckill.mapper;

import com.lc.seckill.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface SecKillMapper{

    boolean updatePessLockInMySQL(Product product);

}

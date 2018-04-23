package com.lc.seckill.exception;

import com.lc.seckill.common.SecKillEnum;
import lombok.Data;

@Data
public class SecKillException extends RuntimeException {

    private SecKillEnum secKillEnum;

    public SecKillException(SecKillEnum secKillEnum){
        this.secKillEnum = secKillEnum;
    }
}

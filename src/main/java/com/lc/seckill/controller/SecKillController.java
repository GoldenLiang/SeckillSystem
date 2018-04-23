package com.lc.seckill.controller;

import com.lc.seckill.common.Message;
import com.lc.seckill.common.SecKillEnum;
import com.lc.seckill.web.req.SecKillRequest;
import com.lc.seckill.web.vo.SecKillResponse;
import com.lc.seckill.service.SecKillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("seckill")
@RestController
public class SecKillController {

    @Autowired
    private SecKillService secKillService;

    @RequestMapping(value = "/pessLockInMySQL",method = RequestMethod.POST)
    public Message<SecKillResponse> pessLockInMySQL(@RequestBody Message<SecKillRequest> requestMessage){
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("username",requestMessage.getBody().getUsername());
        paramMap.put("productId",requestMessage.getBody().getProductId());
        SecKillEnum secKillEnum = secKillService.handleByPessLockInMySQL(paramMap);
        Message<SecKillResponse> responseMessage = new Message<>(secKillEnum,new SecKillResponse());
        return responseMessage;
    }
}

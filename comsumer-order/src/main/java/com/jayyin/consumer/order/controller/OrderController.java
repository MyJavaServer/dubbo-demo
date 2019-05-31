package com.jayyin.consumer.order.controller;

import com.alibaba.fastjson.JSONObject;
import com.jayyin.dubbo.providerorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description This Class is for xxx use
 * @author: jayyin
 * @date: 2019-05-30 19:56
 * @version: 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    //从注册中心订阅 过来的 提供方提供的服务
    @Autowired
    private OrderService mOrderService;

    @PostMapping("/getOrderList")
    @ResponseBody
    public Map getOrderList(@RequestBody JSONObject jsonParams){
        Map<String, Object> resMap = new HashMap<>();
        List<Map> list = mOrderService.getOrderList();
        resMap.put("status", 1);
        resMap.put("result", list);
        return resMap;
    }



}

package com.jayyin.dubbo.providerorder.impl;


import com.jayyin.dubbo.providerorder.service.OrderService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description This Class is for xxx use
 * @author: jayyin
 * @date: 2019-05-30 14:21
 * @version: 1.0
 */
public class OrderServiceImpl implements OrderService {

    @Override
    public List<Map> getOrderList() {
        System.out.println("OrderService.getOrderList()...");
        List<Map> list = new ArrayList<Map>();
        Map order= new HashMap();
        order.put("id", 1);
        order.put("name", "hello dubbo order");
        list.add(order);
        return list;
    }

}

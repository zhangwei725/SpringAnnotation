package com.werner.di.controller;

import com.alibaba.fastjson.JSONArray;
import com.werner.di.entity.Hotel;
import com.werner.di.service.AccountService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * jsr-250
 * jsr-330
 * <p>
 * <p>
 * ┌─┐       ┌─┐ + +
 * ┌──┘ ┴───────┘ ┴──┐++
 * │                 │
 * │       ───       │++ + + +
 * ███████───███████ │+
 * │                 │+
 * │       ─┴─       │
 * │                 │
 * └───┐         ┌───┘
 * │         │
 * │         │   + +
 * │         │
 * │         └──────────────┐
 * │                        │
 * │                        ├─┐
 * │                        ┌─┘
 * │                        │
 * └─┐  ┐  ┌───────┬──┐  ┌──┘  + + + +
 * │ ─┤ ─┤       │ ─┤ ─┤
 * └──┴──┘       └──┴──┘  + + + +
 * 神兽保佑
 * 代码无BUG!
 */

//类注解
//@Component
//<bean id="ac" class="com.werner.di.controller.AccountController">
@Controller("controller")
public class AccountController {
    @Resource
    private AccountService service;

    /**
     * Object
     * 集合
     *
     * @param hostsJson
     */
    public void updateHotels(String hostsJson) {
//        JSONArray.parseArray(json,Class)  解析集合
//        JSONObject.parseObject(json,Class);
        List<Hotel> hotels = JSONArray.parseArray(hostsJson, Hotel.class);
        service.saveHotels(hotels);
    }


}

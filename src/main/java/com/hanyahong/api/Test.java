/*
 * Copyright (c) 2017.版权所有
 */

package com.hanyahong.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hyh on 17-1-4.
 */

@RestController
@RequestMapping(value = {"/test"}, produces = {"application/json"})
@Api(value = "/test", description = "认证中心管理组API")
public class Test {


    /**
     * 获取上传临时签证
     *
     * @return
     */
    @ApiOperation(value = "获取上传临时签证",
            notes = "获取上传临时签证,返回集合，code=200,返回签证，code=300,说明已经获取过，code=400,说明服务器异常",
            response = Map.class, responseContainer = "list")
    @RequestMapping(value = {""}, produces = {"application/json"}, method = {RequestMethod.GET})
    @ResponseBody
    public ResponseEntity<List<Map>> addInquiryPost() {
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("name", "测试");
        map1.put("address", "测试");
        map1.put("number", "测试");
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("name", "测试");
        map2.put("address", "测试");
        map2.put("number", "测试");
        List<Map> list = new ArrayList<Map>();
        list.add(map1);
        list.add(map2);
        return new ResponseEntity(list, HttpStatus.OK);
    }

//    /**
//     * 用户登录
//     *
//     * @return
//     */
//    @ApiOperation(value = "用户登录", notes = "用户登录", response = Void.class)
//    @RequestMapping(value = {""}, produces = {"application/json"}, method = {RequestMethod.POST})
//    @ResponseBody
//    public ResponseEntity<Void> login(
//            @RequestBody Map<String, String> map1
//    ) {
//        Map m = new HashMap();
//        m.put("hyh", "hyh");
//        if (map1.get(0).equals(m.get(0))) {
//
//        }
//
//        return new ResponseEntity(Void, HttpStatus.OK);
//    }

}
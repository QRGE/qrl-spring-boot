package org.qrl.http.controller;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import org.qrl.basic.vo.Result;
import org.qrl.http.entity.dto.XtyPushBaseRequest;
import org.qrl.http.entity.dto.XtySugarRecord;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @Author QR
 * @Date 2021/10/30 11:20 AM
 */
@RestController
@RequestMapping("/form")
public class FormController {

    // consumes可以指定接收 post 数据的格式
    @PostMapping(value = "/get", consumes = "application/x-www-form-urlencoded")
    public Result<?> getFromInfo(@PathParam("nonce") String nonce,
                                 @PathParam("timestamp") String timestamp,
                                 @PathParam("signature") String signature,
                                 XtyPushBaseRequest<String> sugarPush) {
        // get请求
        System.out.println(nonce);
        System.out.println(timestamp);
        System.out.println(signature);
        // 表单请求
        System.out.println(sugarPush.getMsgId());
        System.out.println(sugarPush.getMsgType());
        JSONArray jsonArray = JSONUtil.parseArray(sugarPush.getContent());
        List<XtySugarRecord> xtySugarRecords = JSONUtil.toList(jsonArray, XtySugarRecord.class);
        xtySugarRecords.forEach(System.out::println);
        return Result.OK();
    }
}

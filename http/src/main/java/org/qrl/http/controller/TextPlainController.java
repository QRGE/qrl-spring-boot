package org.qrl.http.controller;

import io.swagger.annotations.ApiOperation;
import org.qrl.web.basic.vo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @Author QR
 * @Date 2021/11/4 11:21 AM
 */
@RestController
@RequestMapping("/text")
public class TextPlainController {

    @ApiOperation("获取text/plain格式的数据")
    @PostMapping("/get")
    public Result<?> getTestPlain(@PathParam("nonce") String nonce,
                                  @PathParam("timestamp") String timestamp,
                                  @PathParam("signature") String signature,
                                  HttpServletRequest request){
        System.out.println(nonce);
        System.out.println(timestamp);
        System.out.println(signature);
        try {
            BufferedReader reader = request.getReader();
            char[] buf = new char[512];
            int len = 0;
            StringBuilder contentBuffer = new StringBuilder();
            while ((len = reader.read(buf)) != -1) {
                contentBuffer.append(buf, 0, len);
            }
            System.out.println(contentBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Result.OK();
    }
}

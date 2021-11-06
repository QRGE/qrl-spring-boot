package org.qrl.http.controller;

import org.qrl.common.api.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author QR
 * @Date 2021/10/30 12:48 PM
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test")
    public Result<?> test() {
        return Result.OK();
    }
}

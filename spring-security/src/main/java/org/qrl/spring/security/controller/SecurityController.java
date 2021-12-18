package org.qrl.spring.security.controller;

import org.qrl.web.basic.vo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qr
 * @date 2021/12/18 20:17
 */
@RestController
@RequestMapping("/spring/security")
public class SecurityController {

    @PostMapping("/login")
    public Result<?> test() {
        return Result.OK("登陆成功");
    }
}

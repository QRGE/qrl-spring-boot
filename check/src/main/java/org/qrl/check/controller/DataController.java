package org.qrl.check.controller;

import org.qrl.check.entity.dto.DataDTO;
import org.qrl.web.basic.vo.Result;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Author: QR
 * @Date: 2021/9/29-13:10
 */
@RestController
@RequestMapping("/check")
public class DataController {

    @GetMapping("/test")
    public Result<?> test() {
        return Result.OK("test-get");
    }

    @PostMapping("/test")
    public Result<?> testValid(@Valid @RequestBody DataDTO dto, BindingResult checkResult) {
        System.out.println(dto);
        // 理论上传入什么东西都可以转换成字符串吧
        System.out.println(dto.getUsername());
        // jackson 的功能很强大, 字符串数字都可以直接解析成对应的数字型
        System.out.println(dto.getSalary());
        if (checkResult.hasErrors()){
            return Result.error(checkResult.getAllErrors().toString());
        }
        return Result.OK("test-post");
    }
}

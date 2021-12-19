package org.qrl.check.controller;

import org.qrl.basic.vo.Result;
import org.qrl.check.entity.po.Employee;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author: QR
 * @Date: 2021/10/2-21:09
 */
@RestController
@RequestMapping("/employee")
@Validated
public class EmployeeController {

    @PostMapping("/add")
    public Result<?> add(@Valid @RequestBody Employee employee) {
        return Result.OK(employee);
    }
}


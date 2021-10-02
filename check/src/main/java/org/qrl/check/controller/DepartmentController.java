package org.qrl.check.controller;

import org.qrl.check.entity.dto.DepartmentDTO;
import org.qrl.common.api.vo.Result;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;

/**
 * @Author: QR
 * @Date: 2021/10/2-13:24
 */
@RestController
@RequestMapping("/dept")
// 对类中的方法开启验证功能
@Validated
public class DepartmentController {

    /**
     * 添加部门可以有两个方法
     * addRoot: 根级部门, patientId = 0
     * add: 添加子级部门信息
     *      patientId != 0 && patientId > 0
     *      id == null
     *      name != null && name. length >= 0
     *      createTime: 不是未来的时间, <= now
     */
    @PostMapping("/add")
    public Result<?> add(@Validated @RequestBody DepartmentDTO dto){
        System.out.println(dto);
        // 业务代码...
        return Result.OK();
    }

    @GetMapping("/query/{id}")
    public Result<?> query(@PathVariable @Positive Integer id) {
        return Result.OK(id);
    }
}

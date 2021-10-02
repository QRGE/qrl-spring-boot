package org.qrl.check.entity.po;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * @Author: QR
 * @Date: 2021/10/2-20:50
 */
@Data
public class Employee {


    private Integer id;

    @NotBlank(message = "员工姓名不能为空")
    private String name;

    @Valid
    private Department department;
}

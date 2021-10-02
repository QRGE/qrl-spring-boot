package org.qrl.check.entity.dto;

import io.swagger.annotations.Api;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

/**
 * @Author: QR
 * @Date: 2021/10/2-13:58
 */
@Api(tags = "添加/修改部门信息传输对象")
@Data
public class DepartmentDTO {

    private Integer id;

    @NotNull(message = "patientId 不能为空")
    @PositiveOrZero(message = "请输入有效的patientId")
    private Integer patientId;

    @NotBlank(message = "部门名字不能为空")
    private String name;
}

package org.qrl.check.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Author: QR
 * @Date: 2021/9/29-13:55
 */
@Data
@ApiModel("测试数据传输对象")
public class DataDTO {

    @NotBlank(message = "username 不能为空")
    @Size(min = 5, max = 30, message = "username 长度有问题")
    @ApiModelProperty("用户名")
    private String username;

    @NotBlank(message = "密码不能为空")
    @Size(min = 5, max = 30, message = "password 长度有问题")
    @ApiModelProperty("密码")
    private String password;

    @NotBlank(message = "用户类型不能为空")
    @ApiModelProperty("用户类型")
    private Integer userType;

    @NotNull(message = "薪水不能为空")
    @ApiModelProperty("薪水")
    private Float salary;
}

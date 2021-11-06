package org.qrl.http.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author QR
 * @Date 2021/10/30 11:56 AM
 */
@ApiModel("Demo表单数据传输对象")
@Data
public class DemoFormDTO<T> {

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("内容")
    private T content;
}

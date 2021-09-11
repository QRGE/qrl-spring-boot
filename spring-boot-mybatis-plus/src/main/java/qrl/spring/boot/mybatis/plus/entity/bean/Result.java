package qrl.spring.boot.mybatis.plus.entity.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author: QR
 * @Date: 2021/9/1-14:48
 */
@Data
@ApiModel(value = "返回消息", description = "接口返回的消息")
public class Result<T> {

    private Integer id;

    @ApiModelProperty(value = "返回数据")
    private T data;

    @ApiModelProperty(name = "返回消息时间name", value = "返回消息时间", notes = "yyyy-MM-dd HH:mm:ss", example = "2021-9-1 14:52:30")
    private Date createTime = new Date();

    /**
     * 接受返回数据
     * @param data 返回的数据
     */
    public Result(T data) {
        this.data = data;
    }
}

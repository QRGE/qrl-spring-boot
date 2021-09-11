package qrl.spring.boot.mybatis.plus.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统日志
 * </p>
 *
 * @author QR
 * @since 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bl_sys_log")
@ApiModel(value="SysLog对象", description="系统日志")
public class SysLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "日志编号")
    private Long logId;

    @ApiModelProperty(value = "请求路径")
    private String logUrl;

    @ApiModelProperty(value = "参数")
    private String logParams;

    @ApiModelProperty(value = "状态，1正常，0异常")
    private Integer logStatus;

    @ApiModelProperty(value = "异常文本")
    private String logMessage;

    @ApiModelProperty(value = "浏览器ua标识")
    private String logUa;

    @ApiModelProperty(value = "controller")
    private String logController;

    @ApiModelProperty(value = "请求方式，GET、POST、PUT、DELETE")
    private String logMethod;

    @ApiModelProperty(value = "响应时间（毫秒）")
    private Long logTime;

    @ApiModelProperty(value = "返回值")
    private String logResult;

    @ApiModelProperty(value = "请求ip")
    private String logIp;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdDate;

    @ApiModelProperty(value = "创建人")
    private String createdBy;


}

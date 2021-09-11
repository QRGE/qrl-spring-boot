package qrl.spring.boot.mybatis.plus.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 帖子类型表
 * </p>
 *
 * @author QR
 * @since 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bl_type")
@ApiModel(value="Type对象", description="帖子类型表")
public class Type implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "分类id")
    @TableId(value = "type_id", type = IdType.AUTO)
    private Long typeId;

    @ApiModelProperty(value = "分类名称")
    private String typeName;

    @ApiModelProperty(value = "帖子数")
    private Integer typeBlogCount;

    @ApiModelProperty(value = "是否启用，0否1是")
    private Integer enable;

    @ApiModelProperty(value = "是否删除，0否1是")
    @TableLogic
    private Integer deleted;


}

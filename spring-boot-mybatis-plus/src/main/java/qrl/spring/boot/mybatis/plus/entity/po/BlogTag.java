package qrl.spring.boot.mybatis.plus.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 帖子-标签表
 * </p>
 *
 * @author QR
 * @since 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bl_blog_tag")
@ApiModel(value="BlogTag对象", description="帖子-标签表")
public class BlogTag implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "帖子ID")
    private Long blogId;

    @ApiModelProperty(value = "标签名")
    private String tagName;

    @ApiModelProperty(value = "标签ID")
    private Long tagId;


}

package qrl.spring.boot.mybatis.plus.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 博客评论表
 * </p>
 *
 * @author QR
 * @since 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bl_blog_comment")
@ApiModel(value="BlogComment对象", description="博客评论表")
public class BlogComment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "博客ID")
    private Long blogId;

    @ApiModelProperty(value = "用户ID·")
    private Long userId;

    @ApiModelProperty(value = "头像")
    private String header;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "评论内容")
    private String content;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdTime;


}

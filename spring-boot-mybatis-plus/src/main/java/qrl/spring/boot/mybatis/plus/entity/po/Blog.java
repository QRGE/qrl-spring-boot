package qrl.spring.boot.mybatis.plus.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 博客表
 * </p>
 *
 * @author QR
 * @since 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bl_blog")
@ApiModel(value="Blog对象", description="博客表")
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "帖子id")
    private Long blogId;

    @ApiModelProperty(value = "标题")
    private String blogTitle;

    @ApiModelProperty(value = "封面")
    private String blogImage;

    @ApiModelProperty(value = "帖子内容")
    private String blogContent;

    @ApiModelProperty(value = "点赞数")
    private Integer blogGoods;

    @ApiModelProperty(value = "阅读数")
    private Integer blogRead;

    @ApiModelProperty(value = "收藏数")
    private Integer blogCollection;

    @ApiModelProperty(value = "博客分类")
    private Long blogType;

    @ApiModelProperty(value = "简介")
    private String blogRemark;

    @ApiModelProperty(value = "评论数")
    private Integer blogComment;

    @ApiModelProperty(value = "文章来源（爬虫时使用）")
    private String blogSource;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "是否删除，0否1是")
    @TableLogic
    private Integer deleted;
}

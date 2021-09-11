package qrl.spring.boot.mybatis.plus.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * 歌曲表
 * </p>
 *
 * @author QR
 * @since 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bl_music")
@ApiModel(value="Music对象", description="歌曲表")
public class Music implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "音乐id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "歌曲名")
    private String name;

    @ApiModelProperty(value = "歌手")
    private String artist;

    @ApiModelProperty(value = "歌曲链接")
    private String url;

    @ApiModelProperty(value = "封面")
    private String cover;

    @ApiModelProperty(value = "歌词")
    private String lrc;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty(value = "是否启用，1是0否")
    private Integer enable;

    @ApiModelProperty(value = "是否删除，1是0否")
    @TableLogic
    private Integer deleted;


}

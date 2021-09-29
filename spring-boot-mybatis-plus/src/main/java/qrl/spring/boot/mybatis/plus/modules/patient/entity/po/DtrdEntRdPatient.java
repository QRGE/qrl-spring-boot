package qrl.spring.boot.mybatis.plus.modules.patient.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 患者表
 * </p>
 *
 * @author QR
 * @since 2021-09-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="DtrdEntRdPatient对象", description="患者表")
public class DtrdEntRdPatient implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "data_id", type = IdType.AUTO)
    private Integer dataId;

    @ApiModelProperty(value = "所属医生")
    private Integer doctorId;

    @ApiModelProperty(value = "所属门店")
    private Integer storeId;

    @ApiModelProperty(value = "手机号码")
    private String patientsMobile;

    @ApiModelProperty(value = "唯一标识")
    private String patientsUuid;

    @ApiModelProperty(value = "登录密码")
    private String patientsPassword;

    @ApiModelProperty(value = "患者姓名")
    private String patientsName;

    @ApiModelProperty(value = "用户昵称")
    private String patientsNikename;

    @ApiModelProperty(value = "年龄")
    private Integer patientsAge;

    @ApiModelProperty(value = "出生日期")
    private LocalDate patientsBirthday;

    @ApiModelProperty(value = "性别")
    private Integer patientsSex;

    @ApiModelProperty(value = "身份证号")
    private String patientsIdCard;

    @ApiModelProperty(value = "身高")
    private Integer patientsHeight;

    @ApiModelProperty(value = "体重")
    private Float patientsWeight;

    @ApiModelProperty(value = "头像图片地址")
    private String patientsImg;

    @ApiModelProperty(value = "是否为医生:1-是,0-否")
    private Integer patientsIsdoctor;

    @ApiModelProperty(value = "患者位置")
    private String patientsLocation;

    @ApiModelProperty(value = "所属推广渠道Id")
    private Integer channelId;

    @ApiModelProperty(value = "患者所属省份Id")
    private Integer patientsProvinceId;

    @ApiModelProperty(value = "患者所属省份名称")
    private String patientsProvinceName;

    @ApiModelProperty(value = "患者所属城市Id")
    private Integer patientsCityId;

    @ApiModelProperty(value = "患者所属城市名称")
    private String patientsCityName;

    @ApiModelProperty(value = "状态")
    private Integer patientsStatus;

    @ApiModelProperty(value = "类型")
    private Integer patientsType;

    @ApiModelProperty(value = "用户设备token")
    private String patientsDeviceTokens;

    @ApiModelProperty(value = "微信昵称")
    private String patientsWxNickname;

    @ApiModelProperty(value = "微信OpenId")
    @TableField("patients_wx_openId")
    private String patientsWxOpenid;

    @ApiModelProperty(value = "网易Id")
    private String patientsNeteaseId;

    @ApiModelProperty(value = "网易token")
    private String patientsNeteaseToken;

    @ApiModelProperty(value = "小米token")
    private String patientsMiAccessToken;

    @ApiModelProperty(value = "小米token")
    private String patientsMiRefreshToken;

    @ApiModelProperty(value = "小米key")
    private String patientsMiMacKey;

    @ApiModelProperty(value = "QQ昵称")
    private String patientsQqNickname;

    @ApiModelProperty(value = "QQ OpenId")
    private String patientsQqOpenId;

    @ApiModelProperty(value = "快捷登录id")
    private String patientsQuickId;

    @ApiModelProperty(value = "快捷登录类型")
    private Integer patientsQuickType;

    @ApiModelProperty(value = "0:允许，1:禁止")
    private Integer patientsUplowsetSwitch;

    @ApiModelProperty(value = "患者名称首字母大写")
    private String patientsInitial;

    @ApiModelProperty(value = "0-OMS,1-APP,2-双佳一体机,3-微信小程序")
    private String patientsClientType;

    @ApiModelProperty(value = "激活日期")
    private LocalDateTime patientsActiveDate;

    @ApiModelProperty(value = "血糖仪IMEI")
    private String patientsXtyImei;

    @ApiModelProperty(value = "企业微信external_userid")
    private String patientsQywxExternalUserid;

    @ApiModelProperty(value = "企业微信userid")
    private String patientsQywxUserid;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer isDel;


}

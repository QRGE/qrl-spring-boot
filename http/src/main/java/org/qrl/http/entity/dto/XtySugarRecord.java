package org.qrl.http.entity.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class XtySugarRecord implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -4295406012578819299L;
    /**
     * 测试ID 主键ID
     */
    private String testId;
    /**
     * 设备唯一标识
     */
    private String deviceImei;
    /**
     * 血糖时段 与系统现有类型一致 无需更改
     */
    private int timeType;


    /**
     * 血糖数据
     */
    private Double sugar;
    /**
     * 患者在设备上测试血糖的时间  格式：yyyy-MM-dd HH:mm:ss
     */
    private String createTime;

    /**
     * 血糖数据上传至服务器时间 格式：yyyy-MM-dd HH:mm:ss
     */
    private String uploadTime;

}

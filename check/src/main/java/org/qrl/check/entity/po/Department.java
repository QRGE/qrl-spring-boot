package org.qrl.check.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * @Author: QR
 * @Date: 2021/10/2-13:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 采用树形结构
     */
    @NotNull(message = "patientId 不能为空")
    private Integer patientId;

    /**
     * 部门名称
     */
    @NotBlank(message = "部门名字不能为空")
    private String name;

    /**
     * 部门创建时间
     */
    private LocalDateTime createTime;
}

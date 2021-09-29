package qrl.spring.boot.mybatis.plus.modules.patient.mapper;

import org.apache.ibatis.annotations.Mapper;
import qrl.spring.boot.mybatis.plus.modules.patient.entity.po.DtrdEntRdPatient;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 患者表 Mapper 接口
 * </p>
 *
 * @author QR
 * @since 2021-09-23
 */
@Mapper
public interface DtrdEntRdPatientMapper extends BaseMapper<DtrdEntRdPatient> {

}

package qrl.spring.boot.mybatis.plus.modules.patient.service.impl;

import qrl.spring.boot.mybatis.plus.modules.patient.entity.po.DtrdEntRdPatient;
import qrl.spring.boot.mybatis.plus.modules.patient.mapper.DtrdEntRdPatientMapper;
import qrl.spring.boot.mybatis.plus.modules.patient.service.IDtrdEntRdPatientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 患者表 服务实现类
 * </p>
 *
 * @author QR
 * @since 2021-09-23
 */
@Service
public class DtrdEntRdPatientServiceImpl extends ServiceImpl<DtrdEntRdPatientMapper, DtrdEntRdPatient> implements IDtrdEntRdPatientService {

}

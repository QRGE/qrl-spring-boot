package qrl.spring.boot.mybatis.plus.modules.patient.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import qrl.spring.boot.mybatis.plus.modules.patient.entity.po.DtrdEntRdPatient;
import qrl.spring.boot.mybatis.plus.modules.patient.service.IDtrdEntRdPatientService;

/**
 * <p>
 * 患者表 前端控制器
 * </p>
 *
 * @author QR
 * @since 2021-09-23
 */
@RestController
@RequestMapping("/patient")
public class DtrdEntRdPatientController {

    @Autowired
    private IDtrdEntRdPatientService patientService;

    @GetMapping("/test")
    public DtrdEntRdPatient test(){
        return patientService.getById(1);
    }
}

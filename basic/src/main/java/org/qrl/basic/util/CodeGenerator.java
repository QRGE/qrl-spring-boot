package org.qrl.basic.util;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * @Author: QR
 * @Date: 2021/9/8-17:16
 */
public class CodeGenerator {

    /**
     * 项目路径
     */
    private final static String PROJECT_PATH = System.getProperty("user.dir");

    /**
     * 需要生成的表
     */
    private final static String[] TABLES = {
            "t_user"
    };

    /**
     * 项目模块名
     */
    private final static String PROJECT_MODULE_NAME = "check";

    /**
     * 功能模块名
     */
    private final static String FUNCTION_MODULE_NAME = "user";

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(PROJECT_PATH + "/" + PROJECT_MODULE_NAME +"/src/main/java");
        gc.setAuthor("QR");
        // id 类型
        gc.setIdType(IdType.AUTO);
        // 生成代码后是否打开代码所在目录
        gc.setOpen(false);
        // swagger 注解开启
        gc.setSwagger2(false);
        // 生成通用查询映射结果
        gc.setBaseResultMap(true);
        // 通用查询结果列
        gc.setBaseColumnList(true);
        // 生成的代码文件覆盖原来的文件, 工作中一定要注意
        gc.setFileOverride(true);

        gc.setActiveRecord(true);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/qrl-spring-boot?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=Asia/Shanghai");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("QR");
        dsc.setPassword("QRWUDI666");
        mpg.setDataSource(dsc);

        // 包配置, 基本上都是设置对应的包名
        PackageConfig pc = new PackageConfig();
        pc.setParent("org.qrl." + PROJECT_MODULE_NAME + ".modules." + FUNCTION_MODULE_NAME);
        pc.setEntity("entity.po");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);

        // 如果不是用默认的 Velocity 引擎, 需要手动设置模板引擎
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 设置生成模板, 大部分情况用默认的模板就足够了, 如果不够可以在 com.baomidou:mybatis-plus-generator 包下扣出模板来改
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setController("template/controller.java");
        templateConfig.setEntity("template/entity.java");
        templateConfig.setMapper("template/mapper.java");
        templateConfig.setService("template/service.java");
        templateConfig.setServiceImpl("template/serviceImpl.java");
        mpg.setTemplate(templateConfig);

        // 策略配置, 可以设置 controller service mapper 等的父类等
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // RestController
        strategy.setRestControllerStyle(true);
        // 设置要自动生成代码的表, 可以利用 .split() 或者 直接传入一个字符串数组指定多个表
        strategy.setInclude(TABLES);
        strategy.setControllerMappingHyphenStyle(true);
        // lombok 模型
        strategy.setEntityLombokModel(true);
        // 逻辑删除字段
        strategy.setLogicDeleteFieldName("is_del");
        mpg.setStrategy(strategy);

        // 执行自动配置
        mpg.execute();
    }
}

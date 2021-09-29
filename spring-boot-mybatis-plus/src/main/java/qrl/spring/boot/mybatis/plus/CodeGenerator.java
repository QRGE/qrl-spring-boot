package qrl.spring.boot.mybatis.plus;

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
            "dtrd_ent_evaluation_rd_angiocardiopathy",
            "dtrd_ent_evaluation_rd_bmq",
            "dtrd_ent_evaluation_rd_diabetes",
            "dtrd_ent_evaluation_rd_diabetic_foot",
            "dtrd_ent_evaluation_rd_happy",
            "dtrd_ent_evaluation_rd_job",
            "dtrd_ent_evaluation_rd_mmas8",
            "dtrd_ent_evaluation_rd_mmpi",
            "dtrd_ent_evaluation_rd_nephropathy",
            "dtrd_ent_evaluation_rd_neuropathy",
            "dtrd_ent_evaluation_rd_personality",
            "dtrd_ent_evaluation_rd_psychology",
            "dtrd_ent_evaluation_rd_retinopathy",
            "dtrd_ent_evaluation_rd_sas",
            "dtrd_ent_evaluation_rd_sds",
            "dtrd_ent_evaluation_rd_sdsca",
            "dtrd_ent_evaluation_rd_sleep"
    };

    /**
     * 模块名
     */
    private final static String MODULE_NAME = "evaluation";

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(PROJECT_PATH + "/spring-boot-mybatis-plus/src/main/java");
        gc.setAuthor("QR");
        gc.setOpen(false);
        gc.setSwagger2(true);
        gc.setBaseResultMap(true);      // 生成通用查询映射结果
        gc.setBaseColumnList(true);     // 通用查询结果列
        gc.setFileOverride(true);       // 生成的代码重写原来的代码, 工作中一定要注意
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/dtrd?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=Asia/Shanghai");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("QR");
        dsc.setPassword("QRWUDI666");
        mpg.setDataSource(dsc);

        // 包配置, 基本上都是设置对应的包名
        PackageConfig pc = new PackageConfig();
        pc.setParent("qrl.spring.boot.mybatis.plus.modules." + MODULE_NAME);
        pc.setEntity("entity.po");
        pc.setMapper("mapper");
        pc.setService("service");
        mpg.setPackageInfo(pc);

        // 如果不是用默认的 Velocity 引擎, 需要手动设置模板引擎
        FreemarkerTemplateEngine templateEngine = new FreemarkerTemplateEngine();
        mpg.setTemplateEngine(templateEngine);

        // 设置生成模板, 大部分情况用默认的模板就足够了, 如果不够可以在 com.baomidou:mybatis-plus-generator 包下扣出模板来改
        TemplateConfig templateConfig = new TemplateConfig();
        mpg.setTemplate(templateConfig);

        // 策略配置, 可以设置 controller service mapper 等的父类等
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setRestControllerStyle(true); // RestController, 记得要开!
        // 设置要自动生成代码的表, 可以利用 .split() 或者 直接传入一个字符串数组指定多个表
        strategy.setInclude(TABLES);
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setEntityLombokModel(true);        // lombok 模型
        strategy.setLogicDeleteFieldName("is_del");
        mpg.setStrategy(strategy);

        // 执行自动配置
        mpg.execute();
    }
}

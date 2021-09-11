package qrl.spring.boot.mybatis.plus;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.yaml.snakeyaml.constructor.BaseConstructor;
import qrl.spring.boot.mybatis.plus.controller.BaseController;

/**
 * @Author: QR
 * @Date: 2021/9/8-17:16
 */
public class CodeGenerator {

    /**
     * 项目路径
     */
    private final static String projectPath = System.getProperty("user.dir");

    /**
     * 需要生成的表
     */
    private final static String[] tables = {
            "bl_blog", "bl_blog_collection", "bl_blog_comment", "bl_blog_goods",
            "bl_blog_tag", "bl_link", "bl_music", "bl_sys_log",
            "bl_tag", "bl_type", "bl_user"
    };

    /**
     * 表的前缀
     */
    private final static String tablePrefix = "bl_";

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(projectPath + "/spring-boot-mybatis-plus/src/main/java");
        gc.setAuthor("QR");
        gc.setOpen(false);
        gc.setSwagger2(true);
        gc.setBaseResultMap(true);      // 生成通用查询映射结果
        gc.setBaseColumnList(true);     // 通用查询结果列
        gc.setFileOverride(true);       // 生成的代码重写原来的代码, 工作中一定要注意
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/qrblog?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=Asia/Shanghai");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("QR");
        dsc.setPassword("QRWUDI666");
        mpg.setDataSource(dsc);

        // 包配置, 基本上都是设置对应的包名
        PackageConfig pc = new PackageConfig();
        pc.setParent("qrl.spring.boot.mybatis.plus");
        pc.setEntity("entity.po");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);

        // 如果不是用默认的 Velocity 引擎, 需要手动设置模板引擎
        FreemarkerTemplateEngine templateEngine = new FreemarkerTemplateEngine();
        mpg.setTemplateEngine(templateEngine);

        // 设置生成模板, 大部分情况用默认的模板就足够了, 如果不够可以在 com.baomidou:mybatis-plus-generator 包下扣出模板来改
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setXml("template/mapper.xml");
        templateConfig.setController("template/controller.java");
        mpg.setTemplate(templateConfig);

        // 策略配置, 可以设置 controller service mapper 等的父类等
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true); // RestController, 记得要开!
        // 设置要自动生成代码的表, 可以利用 .split() 或者 直接传入一个字符串数组指定多个表
        strategy.setInclude(tables);
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(tablePrefix);
        strategy.setSuperControllerClass(BaseController.class);
        strategy.setChainModel(true);       // 构造者模式
        strategy.setEntityLombokModel(true);        // lombok 模型
        strategy.setLogicDeleteFieldName("deleted");
        mpg.setStrategy(strategy);

        // 执行自动配置
        mpg.execute();
    }
}

package qrl.spring.boot.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import qrl.spring.boot.bean.aware.AwareService;

/**
 * @Author: QR
 * @Date: 2021/8/18-12:40
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        AwareService service = context.getBean(AwareService.class);
        service.outputResult();
    }
}

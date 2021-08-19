package qrl.spring.boot.bean.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @Author: QR
 * @Date: 2021/8/18-12:43
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult() {
        System.out.println("BeanName: "+ beanName);
        Resource resource = loader.getResource("classpath:/start.txt");
        try {
            System.out.println("ResourceLoader加载的文件内容: "
                    + IOUtils.toString(resource.getInputStream()));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}

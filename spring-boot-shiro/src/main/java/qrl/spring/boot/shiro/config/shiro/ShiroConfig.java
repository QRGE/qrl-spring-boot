package qrl.spring.boot.shiro.config.shiro;

import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * springboot 整合 shiro 配置
 * @Author: QR
 * @Date: 2021/8/15-20:03
 */
@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 给 filter 设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        // 设置认证界面路径, 默认为 /login.jsp
        shiroFilterFactoryBean.setLoginUrl("/login.jsp");
        // 配置系统的资源访问权限
        Map<String, String> map = new HashMap<>();
        map.put("/user/login", "anon");
        map.put("/user/register", "anon");
        map.put("/register.jsp", "anon");
        map.put("/**", "authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);

        return shiroFilterFactoryBean;
    }

    /**
     * 创建 web 环境下的 SecurityManager
     * @return defaultWebSecurityManager
     */
    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(Realm realm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 给 securityManager 设置 realm
        securityManager.setRealm(realm);

        return securityManager;
    }

    @Bean
    public Realm getRealm() {
        CustomRealm customRealm = new CustomRealm();
        return customRealm;
    }
}

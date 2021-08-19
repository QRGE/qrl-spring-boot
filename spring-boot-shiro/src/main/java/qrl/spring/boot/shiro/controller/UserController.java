package qrl.spring.boot.shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import qrl.spring.boot.shiro.entity.User;
import qrl.spring.boot.shiro.service.UserService;

import javax.annotation.Resource;

/**
 * @Author: QR
 * @Date: 2021/8/15-20:43
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/register")
    public String register(User user) {
        try {
            userService.register(user);
            // 注册成功返回到登陆页面
            return "redirect:/login.jsp";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/register.jsp";
        }
    }

    @PostMapping("/login")
    public String login(String username, String password) {
        // Spring 环境下会自动帮你设置全局的 securityManager , 只要配置了 securityManager 即可
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
            // 认证成功后跳转到首页
            return "redirect:/index.jsp";
        } catch (UnknownAccountException e) {
            e.printStackTrace();
            System.out.println("用户名错误");
        } catch (IncorrectCredentialsException e) {
            e.printStackTrace();
            System.out.println("密码错误");
        }
        // 认证失败
        return "redirect:/login.jsp";
    }

    @GetMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        // 利用 subject 的退出
        subject.logout();
        return "redirect:/login.jsp";
    }
}

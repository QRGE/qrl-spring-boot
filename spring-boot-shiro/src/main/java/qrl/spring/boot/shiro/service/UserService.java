package qrl.spring.boot.shiro.service;

import qrl.spring.boot.shiro.entity.User;

/**
 * @Author: QR
 * @Date: 2021/8/15-21:54
 */
public interface UserService {

    /**
     * 注册用户
     * @param user 注册用户的信息
     */
    void register(User user);
}

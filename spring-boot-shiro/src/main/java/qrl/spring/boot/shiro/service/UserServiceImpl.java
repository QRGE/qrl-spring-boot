package qrl.spring.boot.shiro.service;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Service;
import qrl.spring.boot.shiro.entity.User;
import qrl.spring.boot.shiro.mapper.UserMapper;
import qrl.spring.boot.shiro.util.SaltUtils;

import javax.annotation.Resource;

/**
 * @Author: QR
 * @Date: 2021/8/15-21:55
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public void register(User user) {
        String salt = SaltUtils.getSalt(8);
        // 对明文密码进行 md5 + salt + hash散列
        Md5Hash md5Hash = new Md5Hash(user.getPassword(), salt, 1024);
        // 设置 user 对象
        user.setSalt(salt);
        user.setPassword(md5Hash.toHex());
        userMapper.save(user);
    }
}

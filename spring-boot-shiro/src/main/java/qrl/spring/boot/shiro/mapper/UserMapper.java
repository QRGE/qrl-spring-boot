package qrl.spring.boot.shiro.mapper;

import org.apache.ibatis.annotations.Mapper;
import qrl.spring.boot.shiro.entity.User;

/**
 * @Author: QR
 * @Date: 2021/8/15-21:32
 */
@Mapper
public interface UserMapper {

    /**
     * 保存用户数据
     * @param user 用户数据
     */
    void save(User user);

    /**
     * 根据 username 查询 user
     * @param username username
     * @return 查询的结果
     */
    User findByUsername(String username);
}

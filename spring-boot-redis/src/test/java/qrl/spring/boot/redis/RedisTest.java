package qrl.spring.boot.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * opsForXX: 表示针对 XX 类型数据的操作, 其中 opsForValue 表示字符串类型操作
 * @Author: QR
 * @Date: 2021/8/18-19:02
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class RedisTest {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void stringTest(){
        stringRedisTemplate.opsForValue().set("name", "ZhangSan");
        String name = stringRedisTemplate.opsForValue().get("name");
        System.out.println("Name: " + name);
    }
}

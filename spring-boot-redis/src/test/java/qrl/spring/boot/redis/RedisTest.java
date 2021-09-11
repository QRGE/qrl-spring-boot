package qrl.spring.boot.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import qrl.spring.boot.redis.domain.User;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

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

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void stringRedisTemplateTest(){
        stringRedisTemplate.opsForValue().set("name", "ZhangSan");
        String name = stringRedisTemplate.opsForValue().get("name");
        System.out.println("Name: " + name);
    }

    @Test
    public void redisTemplateTest() {
        User user = new User(1L, "test123", "test123");
        redisTemplate.opsForValue().set(user.getId().toString(), user);
        User getUser = (User) redisTemplate.opsForValue().get(user.getId().toString());
        System.out.println(getUser);
    }

    @Test
    public void boundValueOpsTest() {
        // boundValueQps 可以绑定某个 key 方便对其进行操作
        BoundValueOperations<String, Object> worker = redisTemplate.boundValueOps("Worker");
        User user = new User(2L, "Worker", "test123");
        worker.set(user, 1, TimeUnit.MINUTES);
    }
}

package qrl.spring.boot.shiro.util;

import java.util.Random;

/**
 * @Author: QR
 * @Date: 2021/8/15-21:57
 */
public class SaltUtils {

    public static String getSalt(int n) {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_+-=[]{}\\|.~".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = chars[new Random().nextInt(chars.length)];
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    // 测试工具
    public static void main(String[] args) {
        System.out.println(getSalt(10));
    }
}

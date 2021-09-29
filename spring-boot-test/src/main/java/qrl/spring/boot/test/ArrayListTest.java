package qrl.spring.boot.test;

import qrl.spring.boot.test.bean.Label;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @Author: QR
 * @Date: 2021/9/15-20:31
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Label> labels1 = new ArrayList<>();
        Label label = new Label(1, 0, LocalDateTime.now(), 1, "测试标签1", LocalDateTime.now());
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            labels1.add(label);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList没有初始化容量: " + (end - start) + "ms");

        ArrayList<Label> labels2 = new ArrayList<>(1000000);
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            labels2.add(label);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("ArrayList初始化容量: " + (end2 - start2) + "ms");
    }
}

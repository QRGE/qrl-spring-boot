package list;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: QR
 * @Date: 2021/9/22-13:18
 */
public class ArrayListTest {

    @Test
    public void asListTest(){
        String[] strs = new String[]{"toolMan1", "toolMan2"};
        List<String> list = Arrays.asList(strs);
        Assert.assertEquals(list.size(), 2);
        Assert.assertEquals(list.get(0), "toolMan1");
    }
}

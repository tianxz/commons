package test;

import com.vinci.commons.didclient.SnowflakeUtil;
import org.junit.Assert;
import org.junit.Test;

public class SnowflakeUtilTest {
    @Test
    public void testFirst() {
        for (int i = 0; i < 1000; i++) {
            long id = SnowflakeUtil.next();
            Assert.assertNotEquals(0, id);
            System.out.println(id);
        }
    }
}
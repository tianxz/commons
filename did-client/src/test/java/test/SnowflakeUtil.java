package test;

import org.junit.Assert;
import org.junit.Test;

public class SnowflakeUtil {
    @Test
    public void testFirst() {
        for (int i = 0; i < 1000; i++) {
            long id = com.vinci.commons.didclient.SnowflakeUtil.next();
            Assert.assertNotEquals(0, id);
            System.out.println(id);
        }
    }
}

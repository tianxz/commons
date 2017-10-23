package org.vinci.commons.core.test;

import org.junit.Test;
import org.vinci.commons.core.result.PageData;

import static org.junit.Assert.*;

/**
 * Created by XizeTian on 2017/10/20.
 */
public class PageDataTest {
    @Test
    public void main() {
        PageData<String>
                pageData = null;
        pageData = new PageData<>(1, 10, 101, null);

        assertEquals(101, pageData.getTotal());
        assertEquals(11, pageData.getPageCount());
        assertEquals(1, pageData.getPageIndex());
        assertEquals(2, pageData.getNextPageIndex());
        assertEquals(1, pageData.getPrePageIndex());
        pageData = new PageData<>(1, 10, 101, null);

        assertEquals(101, pageData.getTotal());
        assertEquals(11, pageData.getPageCount());
        assertEquals(1, pageData.getPageIndex());
        assertEquals(2, pageData.getNextPageIndex());
        assertEquals(1, pageData.getPrePageIndex());
    }
}

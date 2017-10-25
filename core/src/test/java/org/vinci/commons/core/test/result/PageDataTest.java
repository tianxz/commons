package org.vinci.commons.core.test.result;

import org.junit.Test;
import org.vinci.commons.core.result.PageData;

/**
 * Created by XizeTian on 2017/10/20.
 */
public class PageDataTest {

    //region //constructor test
    @Test
    public void testConstructor0() {
        PageData<String> pageData = new PageData<>(0, null);

        assertEquals(0, pageData.getTotal());
        assertEquals(1, pageData.getPageCount());
        assertEquals(1, pageData.getPageIndex());
        assertEquals(1, pageData.getNextPageIndex());
        assertEquals(1, pageData.getPrePageIndex());
        assertEquals(1, pageData.getPageLast());
        assertEquals(1, pageData.getPageFirst());
        assertEquals(null, pageData.getData());
    }

    @Test
    public void testConstructor1() {
        PageData<String> pageData = new PageData<>(41, null);

        assertEquals(41, pageData.getTotal());
        assertEquals(5, pageData.getPageCount());
        assertEquals(1, pageData.getPageIndex());
        assertEquals(2, pageData.getNextPageIndex());
        assertEquals(1, pageData.getPrePageIndex());
        assertEquals(5, pageData.getPageLast());
        assertEquals(1, pageData.getPageFirst());
        assertEquals(null, pageData.getData());
    }

    @Test
    public void testConstructor2() {
        PageData<String> pageData = new PageData<>(1, 10, 101, null);

        assertEquals(101, pageData.getTotal());
        assertEquals(11, pageData.getPageCount());
        assertEquals(1, pageData.getPageIndex());
        assertEquals(2, pageData.getNextPageIndex());
        assertEquals(1, pageData.getPrePageIndex());
        assertEquals(11, pageData.getPageLast());
        assertEquals(1, pageData.getPageFirst());
        assertEquals(null, pageData.getData());
    }
    //endregion

}
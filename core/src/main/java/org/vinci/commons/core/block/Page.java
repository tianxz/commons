package org.vinci.commons.core.block;

/**
 * Created by XizeTian on 2017/10/23.
 */
public class Page extends Limit {
    private int pageIndex;
    private int pageSize;

    protected Page(long size, long offset) {
        super(size, offset);
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public static Page instance(int pageIndex, int pageSize) {
        if (pageIndex <= 0) {
            pageIndex = 1;
        }
        if (pageSize <= 0) {
            pageSize = 1;
        }
        if (pageSize > MaxSize.getValue()) {
            pageSize = MaxSize.getValue();
        }

        long size   = pageSize;
        long offset = (pageIndex - 1) * pageSize;

        Page page = new Page(size, offset);
        page.pageIndex = pageIndex;
        page.pageSize = pageSize;

        return page;
    }

    public static class MaxSize {
        private static int                  value       = 2000;
        private static Object               lock        = new Object();
        private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        public static int getValue() {
            synchronized (lock) {
                if (threadLocal.get() != null) {
                    int value = threadLocal.get();
                    threadLocal.set(null);
                    return value;
                } else {
                    return value;
                }
            }
        }

        public static void setValue(int value) {
            synchronized (lock) {
                MaxSize.value = value;
            }
        }

        public static void setOneTimeValue(int value) {
            synchronized (lock) {
                threadLocal.set(value);
            }
        }

        public static void reset() {
            value = 2000;
        }

        public static int InValue(int value) {
            if (value > MaxSize.value) {
                return MaxSize.value;
            } else if (value < 0) {
                return 0;
            } else {
                return value;
            }
        }
    }
}
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

    public static class Size {
        private static final ThreadLocal<Integer> THREAD_LOCAL = new ThreadLocal<>();
        private static final Object               LOCK         = new Object();
        private static       int                  VALUE        = 10;

        public static int getValue() {
            synchronized (LOCK) {
                if (THREAD_LOCAL.get() != null) {
                    int value = THREAD_LOCAL.get();
                    THREAD_LOCAL.set(null);
                    return value;
                } else {
                    return Size.VALUE;
                }
            }
        }

        public static void setValue(int VALUE) {
            Size.VALUE = VALUE;
        }

        public static void setOneTimeValue(int value) {
            synchronized (LOCK) {
                THREAD_LOCAL.set(value);
            }
        }
    }

    public static class MaxSize {
        private static final Object               LOCK         = new Object();
        private static final ThreadLocal<Integer> THREAD_LOCAL = new ThreadLocal<>();
        private static       int                  VALUE        = 2000;

        public static int getValue() {
            synchronized (LOCK) {
                if (THREAD_LOCAL.get() != null) {
                    int value = THREAD_LOCAL.get();
                    THREAD_LOCAL.set(null);
                    return value;
                } else {
                    return MaxSize.VALUE;
                }
            }
        }

        public static void setValue(int value) {
            synchronized (LOCK) {
                MaxSize.VALUE = value;
            }
        }

        public static void setOneTimeValue(int value) {
            synchronized (LOCK) {
                THREAD_LOCAL.set(value);
            }
        }

        public static void reset() {
            VALUE = 2000;
        }

        public static int InValue(int value) {
            if (value > MaxSize.VALUE) {
                return MaxSize.VALUE;
            } else if (value < 0) {
                return 0;
            } else {
                return value;
            }
        }
    }
}
package org.vinci.commons.database.block;

/**
 * Created by XizeTian on 2017/10/23.
 */
public class Page extends Limit {
    private final static Size maxSize = new Size(2000);
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
        if (pageSize > maxSize.getValue()) {
            pageSize = maxSize.getValue();
        }

        long size   = pageSize;
        long offset = (pageIndex - 1) * pageSize;

        Page page = new Page(size, offset);
        page.pageIndex = pageIndex;
        page.pageSize = pageSize;

        return page;
    }

    public static class Size {
        protected final Object               LOCK         = new Object();
        protected final ThreadLocal<Integer> THREAD_LOCAL = new ThreadLocal<>();
        protected       int                  defValue     = 10;
        protected       int                  value        = defValue;

        public Size() {

        }

        public Size(int defValue) {
            this.defValue = defValue;
        }

        public int getValue() {
            synchronized (LOCK) {
                if (THREAD_LOCAL.get() != null) {
                    int value = THREAD_LOCAL.get();
                    THREAD_LOCAL.set(null);
                    return value;
                } else {
                    return this.value;
                }
            }
        }

        public void setValue(int value) {
            synchronized (LOCK) {
                this.value = value;
            }
        }

        public void setOneTimeValue(int value) {
            synchronized (LOCK) {
                THREAD_LOCAL.set(value);
            }
        }

        public void reset() {
            this.value = defValue;
        }

        public int InValue(int value) {
            if (value > this.value) {
                return this.value;
            } else if (value < 0) {
                return 0;
            } else {
                return value;
            }
        }
    }
}
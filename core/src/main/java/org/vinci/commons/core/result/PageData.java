package org.vinci.commons.core.result;

import org.vinci.commons.core.block.Page;

import java.io.Serializable;
import java.util.List;

/**
 * Created by XizeTian on 2017/10/20.
 */
public class PageData<T> implements Serializable {
    private static final Page.Size size = new Page.Size();
    private int  pageIndex;
    private int  pageSize;
    private long total;

    private int pageCount;
    private int prePageIndex;
    private int nextPageIndex;

    private List<T> data;

    public PageData(long total, List<T> data) {
        this(1, size.getValue(), total, data);
    }

    public PageData(int pageIndex, int pageSize, long total, List<T> data) {
        this.pageIndex = pageIndex <= 0 ? 1 : pageIndex;
        this.pageSize = pageSize <= 0 ? 1 : pageSize;
        this.total = total;
        this.data = data;

        this.initPageCount().initPrePageIndex().initNextPageIndex();
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getPrePageIndex() {
        return this.prePageIndex;
    }

    public int getNextPageIndex() {
        return this.nextPageIndex;
    }

    public long getTotal() {
        return total;
    }

    public List<T> getData() {
        return data;
    }

    private PageData initPageCount() {
        int pageCount;
        if (total % getPageSize() == 0) {
            pageCount = (int) total / pageSize;
        } else {
            pageCount = (int) total / pageSize + 1;
        }
        this.pageCount = pageCount == 0 ? 1 : pageCount;
        return this;
    }

    private PageData initPrePageIndex() {
        int prePageIndex = pageIndex - 1;
        if (prePageIndex < 1) {
            this.prePageIndex = 1;
        }
        return this;
    }

    private PageData initNextPageIndex() {
        int nextPageIndex = pageIndex + 1;
        if (nextPageIndex > this.getPageCount()) {
            this.nextPageIndex = this.getPageCount();
        } else {
            this.nextPageIndex = nextPageIndex;
        }
        return this;
    }

    public int getPageLast() {
        return pageCount;
    }

    public int getPageFirst() {
        return pageIndex;
    }
}

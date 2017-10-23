package org.vinci.commons.core.result;

import org.vinci.commons.core.block.Page;

import java.io.Serializable;
import java.util.List;

/**
 * Created by XizeTian on 2017/10/20.
 */
public class PageData<T> implements Serializable {
    private int     pageIndex;
    private int     pageSize;
    private long    total;
    private List<T> data;

    public PageData() {
    }

    public PageData(long total, List<T> data) {
        this.pageSize = Page.Size.getValue();
        this.total = total;
        this.data = data;
    }

    public PageData(int pageIndex, int pageSize, long total, List<T> data) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.total = total;
        this.data = data;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        if (pageSize == 0) {
            return 1;
        } else {
            return pageSize;
        }
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        int pageCount;
        if (total % getPageSize() == 0) {
            pageCount = (int) total / pageSize;
        } else {
            pageCount = (int) total / pageSize + 1;
        }
        pageCount = pageCount == 0 ? 1 : pageCount;
        return pageCount;
    }

    public int getPrePageIndex() {
        int prePageIndex = pageIndex - 1;
        if (prePageIndex < 1) {
            prePageIndex = 1;
        }
        return prePageIndex;
    }

    public int getNextPageIndex() {
        int nextPageIndex = pageIndex + 1;
        if (nextPageIndex > getPageCount()) {
            nextPageIndex = getPageCount();
        }
        return nextPageIndex;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}

package org.vinci.commons.database.block;


public class Limit {
    private long size;
    private long offset;

    protected Limit(long size, long offset) {
        this.size = size;
        this.offset = offset;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }

    public static Limit instance(long size, long offset) {
        Limit limit = new Limit(size, offset);
        return limit;
    }
}
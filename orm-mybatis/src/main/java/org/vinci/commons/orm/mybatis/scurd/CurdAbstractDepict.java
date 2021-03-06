package org.vinci.commons.orm.mybatis.scurd;

import org.vinci.commons.core.exception.NotOwnerException;

import java.util.ArrayList;
import java.util.List;

/**
 * java field 与 database column 的映射
 * Created by XizeTian on 2017/10/19.
 */
public abstract class CurdAbstractDepict<R extends CurdAbstractDepict> {
    private String   fieldName;
    private Class<?> fieldType;
    private String   columnName;
    private String   dataType;
    private boolean  isInclude;
    private List<Object> multiValue = new ArrayList<>();
    private CurdAbstractDepictMap ownerDepictMap;
    private String lo = "and";

    protected void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    protected void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public R and() {
        this.lo = "and";
        return (R) this;
    }

    public R or() {
        this.lo = "or";
        return (R) this;
    }

    public String getLo() {
        return lo;
    }

    public R setFieldType(Class<?> fieldType) {
        this.fieldType = fieldType;
        return (R) this;
    }

    public R setSqlType(String dataType) {
        this.dataType = dataType;
        return (R) this;
    }

    public boolean isInclude() {
        return this.isInclude;
    }

    public R setInclude(boolean include) {
        this.isInclude = include;
        return (R) this;
    }

    public R include() {
        this.isInclude = true;
        return (R) this;
    }

    public R exclude() {
        this.isInclude = false;
        return (R) this;
    }

    public Object getValue() {
        Object val = null;
        if (this.multiValue.size() > 0) {
            val = this.multiValue.get(0);
        }
        return val;
    }

    public R setValue(Object value) {
        this.multiValue.add(value);
        this.include();
        return (R) this;
    }

    public List<Object> getMultiValue() {
        return multiValue;
    }

    public CurdAbstractDepict setMultiValue(List<Object> multiValue) {
        if (multiValue == null) {
            this.multiValue = new ArrayList<>();
        } else {
            this.multiValue = multiValue;
        }
        return this;
    }

    public R setMultiValue(Object... values) {
        this.multiValue = new ArrayList<>();

        return putMultiValue(values);
    }

    public R putMultiValue(Object... values) {
        if (values != null && values.length > 0) {
            for (int i = 0; i < values.length; i++) {
                this.multiValue.add(values[i]);
            }
        }
        return (R) this;
    }

    public <T extends CurdAbstractDepictMap> T getOwnerDepictMap(Class<T> clazz) {
        return getOwnerDepictMap();
    }

    public <T extends CurdAbstractDepictMap> T getOwnerDepictMap() {
        if (ownerDepictMap == null) {
            throw new NotOwnerException();
        }
        return (T) ownerDepictMap;
    }

    public void setOwnerDepictMap(CurdAbstractDepictMap ownerDepictMap) {
        this.ownerDepictMap = ownerDepictMap;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getColumnName() {
        return columnName;
    }

    public R reset() {
        this.isInclude = false;
        this.multiValue = new ArrayList<>();
        return (R) this;
    }
}

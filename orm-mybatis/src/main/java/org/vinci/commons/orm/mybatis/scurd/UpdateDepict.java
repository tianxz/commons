package org.vinci.commons.orm.mybatis.scurd;

public class UpdateDepict extends CurdAbstractDepict<UpdateDepict> {
    public UpdateDepict(String fieldName, String columnName) {
        super.setFieldName(fieldName);
        super.setColumnName(columnName);
    }
}
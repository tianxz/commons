package org.vinci.commons.orm.mybatis.scurd;

public class UpdateDepict extends CurdAbstractDepict<UpdateDepict> {
    public UpdateDepict(String fieldName, String sqlName) {
        super.setFieldName(fieldName);
        super.setSqlName(sqlName);
    }
}
package org.vinci.commons.orm.mybatis.scurd;

import org.vinci.commons.database.JdbcOperator;

public class ReadDepict extends CurdAbstractDepict<ReadDepict> {
    private JdbcOperator operator = JdbcOperator.EQ;

    public ReadDepict(String fieldName, String columnName) {
        super.setFieldName(fieldName);
        super.setColumnName(columnName);
    }

    public ReadDepict(String fieldName, String columnName, CurdAbstractDepictMap<ReadDepict> curdAbstractDepictMap) {
        super.setFieldName(fieldName);
        super.setColumnName(columnName);
        super.setOwnerDepictMap(curdAbstractDepictMap);
    }

    public JdbcOperator getOperator() {
        return operator;
    }

    public ReadDepict setOperator(JdbcOperator operator) {
        this.operator = operator;
        return this;
    }

    @Override
    public ReadDepict reset() {
        this.operator = JdbcOperator.EQ;
        return super.reset();
    }
}
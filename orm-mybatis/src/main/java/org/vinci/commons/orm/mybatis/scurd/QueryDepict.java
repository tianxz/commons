package org.vinci.commons.orm.mybatis.scurd;

import org.vinci.commons.database.JdbcOperator;

public class QueryDepict extends CurdAbstractDepict<QueryDepict> {
    private JdbcOperator operator = JdbcOperator.EQ;

    public QueryDepict(String fieldName, String columnName) {
        super.setFieldName(fieldName);
        super.setColumnName(columnName);
    }

    public QueryDepict(String fieldName, String columnName, CurdAbstractDepictMap<QueryDepict> curdAbstractDepictMap) {
        super.setFieldName(fieldName);
        super.setColumnName(columnName);
        super.setOwnerDepictMap(curdAbstractDepictMap);
    }

    public JdbcOperator getOperator() {
        return operator;
    }

    public QueryDepict setOperator(JdbcOperator operator) {
        this.operator = operator;
        return this;
    }

    @Override
    public QueryDepict reset() {
        this.operator = JdbcOperator.EQ;
        return super.reset();
    }
}
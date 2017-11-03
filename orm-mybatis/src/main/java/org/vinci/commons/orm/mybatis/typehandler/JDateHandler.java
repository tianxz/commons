package org.vinci.commons.orm.mybatis.typehandler;

import jodd.datetime.JDateTime;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.vinci.commons.core.datetime.JDate;

import java.sql.*;

/**
 * Created by XizeTian on 2017/11/3.
 */
@MappedJdbcTypes(JdbcType.DATE)
public class JDateHandler extends BaseTypeHandler<JDate> {
    private final String FORMAT = "YYYY-MM-DD";

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, JDate parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.toString(FORMAT));
    }

    @Override
    public JDate getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Timestamp sqlTimestamp = rs.getTimestamp(columnName);
        if (sqlTimestamp != null) {
            return new JDate(sqlTimestamp.getTime());
        }
        return null;
    }

    @Override
    public JDate getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Timestamp sqlTimestamp = rs.getTimestamp(columnIndex);
        if (sqlTimestamp != null) {
            return new JDate(sqlTimestamp.getTime());
        }
        return null;
    }

    @Override
    public JDate getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Timestamp sqlTimestamp = cs.getTimestamp(columnIndex);
        if (sqlTimestamp != null) {
            return new JDate(sqlTimestamp.getTime());
        }
        return null;
    }
}

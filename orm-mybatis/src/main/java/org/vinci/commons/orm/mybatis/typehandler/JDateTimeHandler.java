package org.vinci.commons.orm.mybatis.typehandler;

import jodd.datetime.JDateTime;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.*;

/**
 * Created by XizeTian on 2017/11/3.
 */
@MappedJdbcTypes(JdbcType.DATE)
public class JDateTimeHandler extends BaseTypeHandler<JDateTime> {
    private final String FORMAT = "YYYY-MM-DD hh:mm:ss";

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, JDateTime parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.toString(FORMAT));
    }

    @Override
    public JDateTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Timestamp sqlTimestamp = rs.getTimestamp(columnName);
        if (sqlTimestamp != null) {
            return new JDateTime(sqlTimestamp.getTime());
        }
        return null;
    }

    @Override
    public JDateTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Timestamp sqlTimestamp = rs.getTimestamp(columnIndex);
        if (sqlTimestamp != null) {
            return new JDateTime(sqlTimestamp.getTime());
        }
        return null;
    }

    @Override
    public JDateTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Timestamp sqlTimestamp = cs.getTimestamp(columnIndex);
        if (sqlTimestamp != null) {
            return new JDateTime(sqlTimestamp.getTime());
        }
        return null;
    }
}

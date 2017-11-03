package org.vinci.commons.orm.mybatis.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.vinci.commons.core.datetime.JTimestamp;

import java.sql.*;

/**
 * Created by XizeTian on 2017/11/3.
 */
@MappedJdbcTypes(JdbcType.TIMESTAMP)
public class JTimestampHandler extends BaseTypeHandler<JTimestamp> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, JTimestamp parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.toString());
    }

    @Override
    public JTimestamp getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Timestamp sqlTimestamp = rs.getTimestamp(columnName);
        if (sqlTimestamp != null) {
            return new JTimestamp(sqlTimestamp.getTime());
        }
        return null;
    }

    @Override
    public JTimestamp getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Timestamp sqlTimestamp = rs.getTimestamp(columnIndex);
        if (sqlTimestamp != null) {
            return new JTimestamp(sqlTimestamp.getTime());
        }
        return null;
    }

    @Override
    public JTimestamp getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Timestamp sqlTimestamp = cs.getTimestamp(columnIndex);
        if (sqlTimestamp != null) {
            return new JTimestamp(sqlTimestamp.getTime());
        }
        return null;
    }
}


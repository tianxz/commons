package org.vinci.commons.orm.mybatis.typehandler;

import jodd.datetime.JDateTime;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.vinci.commons.core.datetime.JTime;

import java.sql.*;

/**
 * Created by XizeTian on 2017/11/3.
 */
@MappedJdbcTypes(JdbcType.TIME)
public class JTimeHandler extends BaseTypeHandler<JTime> {
    private final String FORMAT = "hh:mm:ss";

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, JTime parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.toString(FORMAT));
    }

    @Override
    public JTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Timestamp sqlTimestamp = rs.getTimestamp(columnName);
        if (sqlTimestamp != null) {
            return new JTime(sqlTimestamp.getTime());
        }
        return null;
    }

    @Override
    public JTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Timestamp sqlTimestamp = rs.getTimestamp(columnIndex);
        if (sqlTimestamp != null) {
            return new JTime(sqlTimestamp.getTime());
        }
        return null;
    }

    @Override
    public JTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Timestamp sqlTimestamp = cs.getTimestamp(columnIndex);
        if (sqlTimestamp != null) {
            return new JTime(sqlTimestamp.getTime());
        }
        return null;
    }
}


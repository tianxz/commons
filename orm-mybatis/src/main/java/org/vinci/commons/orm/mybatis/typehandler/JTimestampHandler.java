package org.vinci.commons.orm.mybatis.typehandler;

import jodd.util.StringUtil;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.vinci.commons.core.time.JTimestamp;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by XizeTian on 2017/10/23.
 */
@MappedJdbcTypes(JdbcType.TIMESTAMP)
public class JTimestampHandler extends BaseTypeHandler<JTimestamp> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, JTimestamp parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.toString());
    }

    @Override
    public JTimestamp getNullableResult(ResultSet rs, String columnName) throws SQLException {
        JTimestamp jTimestamp = null;

        String dateTimeString = rs.getString(columnName);
        if (dateTimeString.equals("0000-00-00 00:00:00")) {
            jTimestamp = new JTimestamp();
        } else if (StringUtil.isNotEmpty(dateTimeString)) {
            jTimestamp = new JTimestamp(dateTimeString);
        }
        return jTimestamp;
    }

    @Override
    public JTimestamp getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        throw new RuntimeException("没有实现 JTimestampHandler.getNullableResult(ResultSet rs, int columnIndex)");
    }

    @Override
    public JTimestamp getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        throw new RuntimeException("没有实现 JTimestampHandler.getNullableResult(CallableStatement cs, int columnIndex)");
    }
}
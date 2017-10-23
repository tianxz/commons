package org.vinci.commons.orm.mybatis.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.vinci.commons.core.time.JTime;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by XizeTian on 2017/10/23.
 */
@MappedJdbcTypes(JdbcType.TIME)
public class JTimeHandler extends BaseTypeHandler<JTime> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, JTime parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.toString());
    }

    @Override
    public JTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String timeString = rs.getString(columnName);
        if (timeString == null) {
            return null;
        }
        return new JTime(timeString);
    }

    @Override
    public JTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        throw new RuntimeException("没有实现 JTimeHandler.getNullableResult(ResultSet rs, int columnIndex)");
    }

    @Override
    public JTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        throw new RuntimeException("没有实现 JTimeHandler.getNullableResult(CallableStatement cs, int columnIndex)");
    }
}

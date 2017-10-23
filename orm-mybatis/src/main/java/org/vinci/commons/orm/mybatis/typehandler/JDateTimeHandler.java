package org.vinci.commons.orm.mybatis.typehandler;

import jodd.datetime.JDateTime;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by XizeTian on 2017/10/23.
 */
@MappedJdbcTypes(JdbcType.DATE)
public class JDateTimeHandler extends BaseTypeHandler<JDateTime> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, JDateTime parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.toString("YYYY-MM-DD hh:mm:ss"));
    }

    @Override
    public JDateTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String dateTimeString = rs.getString(columnName);
        if (dateTimeString == null) {
            return null;
        }
        return new JDateTime(dateTimeString);
    }

    @Override
    public JDateTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        throw new RuntimeException("没有实现 JDateTimeHandler.getNullableResult(ResultSet rs, int columnIndex)");
    }

    @Override
    public JDateTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        throw new RuntimeException("没有实现 JDateTimeHandler.getNullableResult(CallableStatement cs, int columnIndex)");
    }
}

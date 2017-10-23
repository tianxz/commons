package org.vinci.commons.database.metadata;

import org.vinci.commons.database.JdbcType;

/**
 * Created by XizeTian on 2017/10/23.
 */
public interface SimpleColumn {
    String getSqlName();

    JdbcType getSqlType();
}
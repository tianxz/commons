package org.vinci.commons.database;

/**
 * Created by XizeTian on 2017/10/23.
 */
public enum JdbcOperator {
    // 对应SQL =
    EQ("EQ"),

    // 对应SQL <>
    NEQ("NEQ"),

    // 对应SQL IN
    IN("IN"),

    // 对应SQL LIKE
    LIKE("LIKE"),

    // 对应SQL &
    AND("AND"),

    // 用于范围查询，例如日期时间范围
    BETWEEN("BETWEEN");

    // 成员变量
    private String value;

    // 构造方法
    JdbcOperator(String value) {
        this.value = value;
    }
}

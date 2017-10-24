package org.vinci.commons.database.mysql;

import org.vinci.commons.database.simple.SimpleColumn;

/**
 * Created by vinci on 2017-10-24 16:19:27.
 */
public class MysqlColumn implements SimpleColumn {
    //表目录
    private String tableCatalog;

    //隶属库
    private String tableSchema;

    //表名
    private String tableName;

    //列名
    private String columnName;

    //列排序
    private long ordinalPosition;

    //默认值
    private String columnDefault;

    //是否为空
    private String isNullable;

    //数据类型
    private String dataType;

    //最大长度
    private long characterMaximumLength;

    //最大长度(8进制)
    private long characterOctetLength;

    //数字位数
    private long numericPrecision;

    //小数位数
    private long numericScale;

    //时间位数
    private long datetimePrecision;

    //编码
    private String characterSetName;

    //字符集
    private String collationName;

    //列类型
    private String columnType;

    //列关键字
    private String columnKey;

    //列额外配置
    private String extra;

    //列权限
    private String privileges;

    //列描述
    private String columnComment;

    //生成的表达式
    private String generationExpression;

    /**
     * 获取 表目录
     */
    public String getTableCatalog() {
        return tableCatalog;
    }

    /**
     * 设置 表目录
     */
    public MysqlColumn setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
        return this;
    }

    /**
     * 获取 隶属库
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /**
     * 设置 隶属库
     */
    public MysqlColumn setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
        return this;
    }

    /**
     * 获取 表名
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置 表名
     */
    public MysqlColumn setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 获取 列名
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 设置 列名
     */
    public MysqlColumn setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 获取 列排序
     */
    public long getOrdinalPosition() {
        return ordinalPosition;
    }

    /**
     * 设置 列排序
     */
    public MysqlColumn setOrdinalPosition(long ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
        return this;
    }

    /**
     * 获取 默认值
     */
    public String getColumnDefault() {
        return columnDefault;
    }

    /**
     * 设置 默认值
     */
    public MysqlColumn setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
        return this;
    }

    /**
     * 获取 是否为空
     */
    public String getIsNullable() {
        return isNullable;
    }

    /**
     * 设置 是否为空
     */
    public MysqlColumn setIsNullable(String isNullable) {
        this.isNullable = isNullable;
        return this;
    }

    /**
     * 获取 数据类型
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * 设置 数据类型
     */
    public MysqlColumn setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 获取 最大长度
     */
    public long getCharacterMaximumLength() {
        return characterMaximumLength;
    }

    /**
     * 设置 最大长度
     */
    public MysqlColumn setCharacterMaximumLength(long characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
        return this;
    }

    /**
     * 获取 最大长度(8进制)
     */
    public long getCharacterOctetLength() {
        return characterOctetLength;
    }

    /**
     * 设置 最大长度(8进制)
     */
    public MysqlColumn setCharacterOctetLength(long characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
        return this;
    }

    /**
     * 获取 数字位数
     */
    public long getNumericPrecision() {
        return numericPrecision;
    }

    /**
     * 设置 数字位数
     */
    public MysqlColumn setNumericPrecision(long numericPrecision) {
        this.numericPrecision = numericPrecision;
        return this;
    }

    /**
     * 获取 小数位数
     */
    public long getNumericScale() {
        return numericScale;
    }

    /**
     * 设置 小数位数
     */
    public MysqlColumn setNumericScale(long numericScale) {
        this.numericScale = numericScale;
        return this;
    }

    /**
     * 获取 时间位数
     */
    public long getDatetimePrecision() {
        return datetimePrecision;
    }

    /**
     * 设置 时间位数
     */
    public MysqlColumn setDatetimePrecision(long datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
        return this;
    }

    /**
     * 获取 编码
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * 设置 编码
     */
    public MysqlColumn setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * 获取 字符集
     */
    public String getCollationName() {
        return collationName;
    }

    /**
     * 设置 字符集
     */
    public MysqlColumn setCollationName(String collationName) {
        this.collationName = collationName;
        return this;
    }

    /**
     * 获取 列类型
     */
    public String getColumnType() {
        return columnType;
    }

    /**
     * 设置 列类型
     */
    public MysqlColumn setColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * 获取 列关键字
     */
    public String getColumnKey() {
        return columnKey;
    }

    /**
     * 设置 列关键字
     */
    public MysqlColumn setColumnKey(String columnKey) {
        this.columnKey = columnKey;
        return this;
    }

    /**
     * 获取 列额外配置
     */
    public String getExtra() {
        return extra;
    }

    /**
     * 设置 列额外配置
     */
    public MysqlColumn setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    /**
     * 获取 列权限
     */
    public String getPrivileges() {
        return privileges;
    }

    /**
     * 设置 列权限
     */
    public MysqlColumn setPrivileges(String privileges) {
        this.privileges = privileges;
        return this;
    }

    /**
     * 获取 列描述
     */
    public String getColumnComment() {
        return columnComment;
    }

    /**
     * 设置 列描述
     */
    public MysqlColumn setColumnComment(String columnComment) {
        this.columnComment = columnComment;
        return this;
    }

    /**
     * 获取 生成的表达式
     */
    public String getGenerationExpression() {
        return generationExpression;
    }

    /**
     * 设置 生成的表达式
     */
    public MysqlColumn setGenerationExpression(String generationExpression) {
        this.generationExpression = generationExpression;
        return this;
    }
}
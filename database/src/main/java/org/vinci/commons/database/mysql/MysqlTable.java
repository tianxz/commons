package org.vinci.commons.database.mysql;

import jodd.datetime.JDateTime;

/**
 * Created by vinci on 2017-10-24 15:21:40.
 */
public class MysqlTable {
    //表目录
    private String tableCatalog;

    //隶属库
    private String tableSchema;

    //表名
    private String tableName;

    //表类型
    private String tableType;

    //表引擎
    private String engine;

    //表版本号
    private long version;

    //表格式: 1.Fixed; 2.Dynamic;
    private String rowFormat;

    //数据行数
    private long tableRows;

    //平均行数
    private long avgRowLength;

    //表数据总长度
    private long dataLength;

    //表最大数据总长度
    private long maxDataLength;

    //索引长度
    private long indexLength;

    //空闲长度
    private long dataFree;

    //当前自增长值
    private long autoIncrement;

    //创建日期
    private JDateTime createTime;

    //更新日期
    private JDateTime updateTime;

    //检查时间
    private JDateTime checkTime;

    //排序规则
    private String tableCollation;

    //校验和
    private long checksum;

    //命令项
    private String createOptions;

    //描述
    private String tableComment;

    /**
     * 获取 表目录
     */
    public String getTableCatalog() {
        return tableCatalog;
    }

    /**
     * 设置 表目录
     */
    public MysqlTable setTableCatalog(String tableCatalog) {
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
    public MysqlTable setTableSchema(String tableSchema) {
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
    public MysqlTable setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 获取 表类型
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * 设置 表类型
     */
    public MysqlTable setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * 获取 表引擎
     */
    public String getEngine() {
        return engine;
    }

    /**
     * 设置 表引擎
     */
    public MysqlTable setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 获取 表版本号
     */
    public long getVersion() {
        return version;
    }

    /**
     * 设置 表版本号
     */
    public MysqlTable setVersion(long version) {
        this.version = version;
        return this;
    }

    /**
     * 获取 表格式: 1.Fixed; 2.Dynamic;
     */
    public String getRowFormat() {
        return rowFormat;
    }

    /**
     * 设置 表格式: 1.Fixed; 2.Dynamic;
     */
    public MysqlTable setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
        return this;
    }

    /**
     * 获取 数据行数
     */
    public long getTableRows() {
        return tableRows;
    }

    /**
     * 设置 数据行数
     */
    public MysqlTable setTableRows(long tableRows) {
        this.tableRows = tableRows;
        return this;
    }

    /**
     * 获取 平均行数
     */
    public long getAvgRowLength() {
        return avgRowLength;
    }

    /**
     * 设置 平均行数
     */
    public MysqlTable setAvgRowLength(long avgRowLength) {
        this.avgRowLength = avgRowLength;
        return this;
    }

    /**
     * 获取 表数据总长度
     */
    public long getDataLength() {
        return dataLength;
    }

    /**
     * 设置 表数据总长度
     */
    public MysqlTable setDataLength(long dataLength) {
        this.dataLength = dataLength;
        return this;
    }

    /**
     * 获取 表最大数据总长度
     */
    public long getMaxDataLength() {
        return maxDataLength;
    }

    /**
     * 设置 表最大数据总长度
     */
    public MysqlTable setMaxDataLength(long maxDataLength) {
        this.maxDataLength = maxDataLength;
        return this;
    }

    /**
     * 获取 索引长度
     */
    public long getIndexLength() {
        return indexLength;
    }

    /**
     * 设置 索引长度
     */
    public MysqlTable setIndexLength(long indexLength) {
        this.indexLength = indexLength;
        return this;
    }

    /**
     * 获取 空闲长度
     */
    public long getDataFree() {
        return dataFree;
    }

    /**
     * 设置 空闲长度
     */
    public MysqlTable setDataFree(long dataFree) {
        this.dataFree = dataFree;
        return this;
    }

    /**
     * 获取 当前自增长值
     */
    public long getAutoIncrement() {
        return autoIncrement;
    }

    /**
     * 设置 当前自增长值
     */
    public MysqlTable setAutoIncrement(long autoIncrement) {
        this.autoIncrement = autoIncrement;
        return this;
    }

    /**
     * 获取 创建日期
     */
    public JDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建日期
     */
    public MysqlTable setCreateTime(JDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 获取 更新日期
     */
    public JDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新日期
     */
    public MysqlTable setUpdateTime(JDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 获取 检查时间
     */
    public JDateTime getCheckTime() {
        return checkTime;
    }

    /**
     * 设置 检查时间
     */
    public MysqlTable setCheckTime(JDateTime checkTime) {
        this.checkTime = checkTime;
        return this;
    }

    /**
     * 获取 排序规则
     */
    public String getTableCollation() {
        return tableCollation;
    }

    /**
     * 设置 排序规则
     */
    public MysqlTable setTableCollation(String tableCollation) {
        this.tableCollation = tableCollation;
        return this;
    }

    /**
     * 获取 校验和
     */
    public long getChecksum() {
        return checksum;
    }

    /**
     * 设置 校验和
     */
    public MysqlTable setChecksum(long checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * 获取 命令项
     */
    public String getCreateOptions() {
        return createOptions;
    }

    /**
     * 设置 命令项
     */
    public MysqlTable setCreateOptions(String createOptions) {
        this.createOptions = createOptions;
        return this;
    }

    /**
     * 获取 描述
     */
    public String getTableComment() {
        return tableComment;
    }

    /**
     * 设置 描述
     */
    public MysqlTable setTableComment(String tableComment) {
        this.tableComment = tableComment;
        return this;
    }

}
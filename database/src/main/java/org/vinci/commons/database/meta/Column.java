package org.vinci.commons.database.meta;

public class Column extends KeyBase<Column> {
    private String asName;
    private String prefix;
    private String funcName;

    public Column setAsName(String asName) {
        this.asName = asName;
        return this;
    }

    public Column setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    public Column setFuncName(String funcName) {
        this.funcName = funcName;
        return this;
    }

    public String getAsName() {
        return asName;
    }

    public String getFuncName() {
        return funcName;
    }

    public String getPrefix() {
        return prefix;
    }
}

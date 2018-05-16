package org.vinci.commons.database.meta;

public class Column extends KeyBase<Column> {
    private String asName;
    private String prefix;

    public Column setAsName(String asName) {
        this.asName = asName;
        return this;
    }

    public Column setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    public String getAsName() {
        return asName;
    }

    public String getPrefix() {
        return prefix;
    }
}

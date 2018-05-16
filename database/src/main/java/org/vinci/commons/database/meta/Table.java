package org.vinci.commons.database.meta;

public class Table extends KeyBase<Table> {
    private String asName;
    private String prefix;

    public String getAsName() {
        return asName;
    }

    public void setAsName(String asName) {
        this.asName = asName;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}

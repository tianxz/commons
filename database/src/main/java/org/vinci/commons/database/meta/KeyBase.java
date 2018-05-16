package org.vinci.commons.database.meta;

public abstract class KeyBase<T extends KeyBase> {
    private String name;

    public String getName() {
        return name;
    }

    public T setName(String name) {
        this.name = name;
        return (T) this;
    }
}

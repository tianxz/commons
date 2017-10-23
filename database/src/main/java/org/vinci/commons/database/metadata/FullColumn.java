package org.vinci.commons.database.metadata;

/**
 * Created by XizeTian on 2017/10/23.
 */
public interface FullColumn extends SimpleColumn {
    int getSqlLength();

    boolean isNull();
}

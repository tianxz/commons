package org.vinci.commons.orm.mybatis.scurd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 提供快速配置curd
 * Created by XizeTian on 2017/10/19.
 */
public abstract class CurdAbstractDepictMap<T extends CurdAbstractDepict> extends HashMap<String, T> {

    public List<T> toList() {
        List<T> lst = new ArrayList<>();
        for (String key : this.keySet()) {
            if (this.get(key).isInclude()) {
                lst.add(this.get(key));
            }
        }
        return lst;
    }

    public void resetAll() {
        for (String key : this.keySet()) {
            this.get(key).reset();
        }
    }
}
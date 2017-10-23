##### 定义如何执行CURD
###### 1. ReadDepict: 如何执行查询的描述体
###### 2. UpdateDepict: 如何执行更新的描述体
###### 3. CurdAbstractDepictMap: CURD描述体的Map容器
###### 4. 使用描述体
- 自定义 UserQueryDepictMap.java 可以快速的配置一个查询用户描述体的Map容器
```
public class UserQueryDepictMap extends CurdAbstractDepictMap<ReadDepict> {
    public UserQueryDepictMap() {
        this.put("id", new ReadDepict("id", "ID", this));
        this.put("realName", new ReadDepict("realName", "REAL_NAME", this));
    }

    public ReadDepict getSqlQueryForId() {
        return this.get("id");
    }

    public ReadDepict getSqlQueryForRealName() {
        return this.get("realName");
    }
}
```
- 在你使用查询用户描述体的Map得到List<ReadDepict>类型的对象时, 可以将此List对象传递给Mybatis, 因为Mybatis提供的xml配置可以解析List, 根据这个List你就能得到自己想要的SQL查询脚本;
```
List<ReadDepict> queryUserDepict = new UserQueryDepictMap()
        .getSqlQueryForId().setValue("1").include().setOperator(JdbcOperator.EQ).getOwnerDepictMap(UserQueryDepictMap.class)
        .getSqlQueryForRealName().setValue("Vinci Tian").include().setOperator(JdbcOperator.LIKE).getOwnerDepictMap(UserQueryDepictMap.class)
        .toList();
```

##### 附录
`curd: C=create, U=update, R=read, D=delete`
`scurd: simple curd`
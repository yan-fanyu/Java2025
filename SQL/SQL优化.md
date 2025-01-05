# 插入数据优化
## 少量数据插入-使用insert
- 批量操作(500-1000条)
- 手动提交事务
- 主键顺序插入
## 大量数据插入-使用load
load的使用方法
```mysql
# 连接数据库时，加上参数 --local-infile
mysql --local-infile -u root -p
# 是个直全局参数local_infile为1，开启从本地加载文件导入数据的开关
set global local_infile = 1;
# 执行load指令将准备好的数据，加载到表结构中
load data local infile '/root/sql.log' into table 'user' fields terminated by ',' lines terminated by '\n';
```


# 主键优化
## 页分裂
插入数据后，可能会导致页分裂


## 页合并
删除数据后，可能会导致页合并 \
阈值默认 50%
![img_31.png](img_31.png)
![img_32.png](img_32.png)
# order by

## 主键的设计原则
- 主键长度尽可能要小 \
因为聚集索引只有一个（默认是主键索引），而二级索引有很多，聚集索引的叶子节点存储的是聚集索引的值，所以如果聚集索引的长度较大，则会浪费很多空间
![img_33.png](img_33.png)
- 插入数据时，尽量选择顺序插入
- 尽量不要使用UUID做主键或者是其他的自然主键，例如身份证号码
- 业务操作的时候，避免对主键的修改


# group by

# limit

# count

# update




















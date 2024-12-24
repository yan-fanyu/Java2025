
# JDK8新特性
- 用元空间代替了永久代
- **引入了Lambda 表达式**
- 引入了日期类、接口默认方法，静态方法
- **新增了 Stream 流类**
- 引入了Optional 类
- 新增了 CompletableFuture、StampedLock等并发实现类
- Annotation 注解
- **函数式接口**

视频：https://www.bilibili.com/video/BV1M54y157nz

## 接口默认方法
```java
package org.opencode;

public interface TestDefaultFunction {
    // 实现类无需强制重载该接口函数
    default Integer add(Integer a, Integer b){
        return a + b;
    }
    // 实现类必须重载接口函数
    Integer multiply(Integer a, Integer b);
}

}
```
## lambda 表达式
作用：简化匿名内部类
java8 之前
```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// JDK8 之前
List<String> names = Arrays.asList("Tom", "Mike", "Helen", "Nancy");
Collections.sort(names, new Comparator<String>(){
    @Override
    public int compare(String a, String b){
        return b.compareTo(a);
    }
});
```
java8 之后
```java
package org.opencode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(90);
        Collections.sort(list, (a, b) -> {return b - a;});
        for(Integer x: list){
            System.out.println(x);
        }
    }
}
```


## 函数式接口

### 四大函数式接口














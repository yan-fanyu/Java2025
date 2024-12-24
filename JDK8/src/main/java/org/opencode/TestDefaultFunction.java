package org.opencode;

public interface TestDefaultFunction {
    // 实现类无需强制重载该接口函数
    default Integer add(Integer a, Integer b){
        return a + b;
    }
    // 实现类必须重载接口函数
    Integer multiply(Integer a, Integer b);
}

package com.xueershangda.tianxun;

import com.vteba.utils.reflection.ReflectUtils;
import com.vteba.utils.reflection.TypeReference;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yinlei
 * @since 2018/9/12 16:47
 */
public class GenericTest {
    @org.junit.Test
    public void test() {
        Class cls = Map.class;
        Class cls2 = HashMap.class;
        Type type = new TypeReference<Map>(){}.getType();
        System.out.println(type == Map.class);
        System.out.println(cls == Map.class);
        System.out.println(cls2 == Map.class);
        ReflectUtils.getGenericSuperClass(Map.class);
        ReflectUtils.getGenericSuperClass(HashMap.class);
        ReflectUtils.getGenericType(Map.class);
        ReflectUtils.getGenericType(HashMap.class);
        ReflectUtils.getGenericClass(Map.class);
        ReflectUtils.getGenericClass(HashMap.class);
    }
}

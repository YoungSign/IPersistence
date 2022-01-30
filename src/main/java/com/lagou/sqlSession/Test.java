package com.lagou.sqlSession;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> StringList = Class.forName("com.lagou.sqlSession.Test");
        Method method = StringList.getMethod("StringList", null);

        if (method.getGenericReturnType() instanceof ParameterizedType) {
            System.out.println("ParameterizedType true");
        }

        if (method.getGenericReturnType() == List.class) {
            System.out.println("List.class true");
        }
    }

    public List StringList() {
        List<String> arrayList = new ArrayList();
        arrayList.add("123");
        return arrayList;
    }

}

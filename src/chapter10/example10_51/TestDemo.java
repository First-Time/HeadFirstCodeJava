package chapter10.example10_51;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestDemo {
    public static void main(String[] args) {
        String field = "title";
        try {
            Class<?> cls = Class.forName("chapter10.example10_51.Book");
            Object obj = cls.newInstance();
            Method setMet = cls.getMethod("set" + initcap(field), String.class);
            Method getMet = cls.getMethod("get" + initcap(field));
            setMet.invoke(obj, "Java开发实战经典");
            System.out.println(getMet.invoke(obj));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    private static String initcap(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
    }
}

package chapter10.example10_52;

import java.lang.reflect.Field;

public class TestDemo {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("chapter10.example10_52.Book");
            Object obj = cls.newInstance();
            Field field = cls.getDeclaredField("title");
            field.setAccessible(true);
            field.set(obj, "Java开发实战经典");
            System.out.println(field.get(obj));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}

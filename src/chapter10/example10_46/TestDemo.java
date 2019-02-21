package chapter10.example10_46;

import java.util.Date;

public class TestDemo {
    public static void main(String[] args) {
        /*Date date = new Date();
        System.out.println(date.getClass());*/

        Date date = new Date();
        System.out.println(date.getClass());

        Class<? extends Date> cls = date.getClass();
        System.out.println(cls.getName());

        Class<?> cls2 = Date.class;
        System.out.println(cls2.getName());

        try {
            Class<?> cls3 = Class.forName("java.util.Date");
            System.out.println(cls3.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

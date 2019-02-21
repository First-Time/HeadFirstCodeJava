package chapter10.example10_50;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestDemo {
    public static void main(String[] args) {
        try {
            Constructor<?> constructor = Class.forName("chapter10.example10_50.Book").getConstructor(String.class, Double.class);
            Book book = (Book) constructor.newInstance("Java开发实战经典", 79.8);
            System.out.println(book);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

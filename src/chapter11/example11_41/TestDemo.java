package chapter11.example11_41;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        deser();
    }

    private static void deser() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ObjectInputStream oos = new ObjectInputStream(new FileInputStream(new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "book.ser")));
        Object obj = oos.readObject();
        Class<?> cls = obj.getClass();
        Method method = cls.getDeclaredMethod("toString");
        System.out.println(method.invoke(obj));
//        Book book = (Book) oos.readObject();
//        System.out.println(book);
        oos.close();
    }
}

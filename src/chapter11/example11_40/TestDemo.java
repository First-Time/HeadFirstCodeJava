package chapter11.example11_40;

import chapter11.example11_39.Book;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        ser();
    }

    private static void ser() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "book.ser")));
        oos.writeObject(new Book("Java开发实战经典", 79.8));
        oos.close();
    }
}

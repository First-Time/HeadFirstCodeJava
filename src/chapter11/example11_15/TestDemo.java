package chapter11.example11_15;

import java.io.*;
import java.text.ParseException;

public class TestDemo {
    public static void main(String[] args) throws ParseException, IOException {
        File file = new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "mldn.txt");
        if (file.exists()) {
            Reader input = new FileReader(file);
            char data[] = new char[1024];
            int len = input.read(data);
            input.close();
            System.out.println("【" + new String(data, 0, len) + "】");
        }
    }
}

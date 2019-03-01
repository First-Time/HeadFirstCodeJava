package chapter11.example11_25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestDemo {
    public static void main(String[] args) throws FileNotFoundException {
        String name = "李兴华";
        int age = 19;
        double score = 59.95891023456;
        PrintStream printStream = new PrintStream(new FileOutputStream(new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "yootk.txt")));
        printStream.printf("姓名：%s，年龄：%d，成绩：%5.2f", name, age, score);
    }
}

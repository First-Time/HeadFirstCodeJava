package chapter11.example11_24;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream(new FileOutputStream(new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "mldn.txt")));
        printStream.print("优拓教育");
        printStream.println("www.yootk.com");
        printStream.println(1 + 2);
        printStream.println(1.1 + 1.1);
        printStream.close();
    }
}

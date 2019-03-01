package chapter11.example11_23;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        PrintUtil printUtil = new PrintUtil(new FileOutputStream(new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "mldn.txt")));
        printUtil.print("优拓教育");
        printUtil.println("www.yootk.com");
        printUtil.println(1 + 1);
        printUtil.println(1.1 + 1.1);
        printUtil.close();
    }
}

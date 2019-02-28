package chapter11.example11_4;

import java.io.File;
import java.text.ParseException;

public class TestDemo {
    public static void main(String[] args) throws ParseException {
        File file = new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java");
        if (file.isDirectory()) {
            File result[] = file.listFiles();
            for (int x = 0; x < result.length; x++) {
                System.out.println(result[x]);
            }
        }
    }
}

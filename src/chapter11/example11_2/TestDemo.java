package chapter11.example11_2;

import java.io.File;
import java.io.IOException;

public class TestDemo {
    public static void main(String[] args) throws IOException {
//        File file = new File("/Users/zinclee123/Desktop/LYF/Learning/Java/第一行代码Java/test/test.txt");
        File file = new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "test.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        System.out.println(file.createNewFile());
    }
}

package chapter11.example11_1;

import java.io.File;
import java.io.IOException;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/zinclee123/Desktop/LYF/Learning/Java/第一行代码Java/test.txt");
        if (file.exists()) {
            file.delete();
        } else {
            System.out.println(file.createNewFile());
        }
    }
}

package chapter11.example11_9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        File file = new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "mldn.txt");
        if (file.exists()) {
            InputStream input = new FileInputStream(file);
            byte data[] = new byte[1024];
            int pos = 0;
            int temp;
            while ((temp = input.read()) != -1) {
                data[pos++] = (byte) temp;
            }
            input.close();
            System.out.println("【" + new String(data, 0, pos) + "】");
        }
    }
}

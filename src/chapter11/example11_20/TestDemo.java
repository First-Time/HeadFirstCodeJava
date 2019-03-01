package chapter11.example11_20;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        File file = new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "mldn_乱码.txt");
        OutputStream output = new FileOutputStream(file);
        output.write("更多课程请访问：www.yootk.com".getBytes("ISO8859-1"));
        output.close();
    }
}

package chapter11.example11_17;

import java.io.*;
import java.text.ParseException;

public class TestDemo {
    public static void main(String[] args) throws ParseException, IOException {
        File file = new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "mldn.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        OutputStream output = new FileOutputStream(file, true);
        Writer writer = new OutputStreamWriter(output);
        String str = "更多课程资源请访问：www.yootk.com\n";
        writer.write(str);
        writer.close();
    }
}

package chapter11.example11_22;

import java.io.*;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        File file = new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "mldn.txt");
        File file2 = new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "test.txt");
        InputStream input = new FileInputStream(file);
        InputStream input2 = new FileInputStream(file2);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        int temp;
        while ((temp = input.read()) != -1) {
            output.write(temp);
        }
        while ((temp = input2.read()) != -1) {
            output.write(temp);
        }
        byte data[] = output.toByteArray();
        System.out.println(new String(data));
        input.close();
        output.close();
    }
}

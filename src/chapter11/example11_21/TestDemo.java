package chapter11.example11_21;

import java.io.*;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        String str = "www.yootk.com & www.MLDN.cn";
        InputStream input = new ByteArrayInputStream(str.getBytes());
        OutputStream output = new ByteArrayOutputStream();
        int temp;
        while ((temp = input.read()) != -1) {
            output.write(Character.toUpperCase(temp));
        }
        System.out.println(output);
        input.close();
        output.close();
    }
}

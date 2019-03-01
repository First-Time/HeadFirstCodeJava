package chapter11.example11_30;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        InputStream input = System.in;
        byte data[] = new byte[10];
        System.out.print("请输入数据：");
        int len = input.read(data);
        System.out.println("输入数据为：" + new String(data, 0, len));
        input.close();

        /*InputStream input = System.in;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte data[] = new byte[10];
        int len;
        System.out.print("请输入数据：");
        while ((len = input.read(data)) != -1) {
            String str = new String(data, 0, len);
            if (str.contains("\n")) {
                str = str.substring(0, str.length() - 1);
                output.write(str.getBytes());
                break;
            }
            output.write(str.getBytes());
        }
        System.out.println("输入数据为：" + new String(output.toByteArray()));
        input.close();
        output.close();*/
    }
}

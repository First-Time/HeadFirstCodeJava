package chapter11.example11_31;

import java.io.IOException;
import java.io.InputStream;

/**
 * 输入中文出现乱码，这是因为一个中文的编码拆分成了两半（每次读取一个字节）而造成的编码错误。
 * 要解决此类问题，就可以利用字符缓冲输入流完成。
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        InputStream input = System.in;
        System.out.print("请输入数据：");
        StringBuffer stringBuffer = new StringBuffer();
        int temp;
        while ((temp = input.read()) != -1) {
            if (temp == '\n') {
                break;
            }
            stringBuffer.append(String.valueOf((char) temp));
        }
        System.out.println("输入数据为：" + stringBuffer);
    }
}

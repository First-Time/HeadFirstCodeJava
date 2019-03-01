package chapter11.example11_32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 键盘数据输入的标准格式
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入数据：");
        System.out.println("输入数据为：" + bufferedReader.readLine());
        bufferedReader.close();
    }
}

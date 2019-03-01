package chapter11.example11_33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while (flag) {
            System.out.print("请输入年龄：");
            String str = bufferedReader.readLine();
            if (str.matches("\\d{1,3}")) {
                System.out.println("年龄为：" + str);
                flag = false;
            } else
                System.out.println("年龄输入错误，应该由数字所组成。");
        }
    }
}

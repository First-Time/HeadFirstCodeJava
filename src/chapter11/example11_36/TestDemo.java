package chapter11.example11_36;

import java.io.IOException;
import java.util.Scanner;

/**
 * 输入一个数字——double
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩：");
        if (scanner.hasNextDouble()) {
            System.out.println("输入内容：" + scanner.next());
        } else {
            System.out.println("输入的不是数字，错误！");
        }
        scanner.close();
    }
}

package chapter11.example11_37;

import java.io.IOException;
import java.util.Scanner;

/**
 * 输入一个数字——double
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入生日：");
        if (scanner.hasNext("\\d{4}-\\d{2}-\\d{2}")) {
            System.out.println("输入内容：" + scanner.next("\\d{4}-\\d{2}-\\d{2}"));
        } else {
            System.out.println("输入的生日格式错误！");
        }
        scanner.close();
    }
}

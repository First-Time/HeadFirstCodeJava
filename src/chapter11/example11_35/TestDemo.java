package chapter11.example11_35;

import java.io.IOException;
import java.util.Scanner;

/**
 * 利用Scanner实现键盘数据输入
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入内容：");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}

package chapter11.exercises5_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("请依次输入三个整数：");
        for (int x = 0; x < 3; x++) {
            list.add(scanner.nextInt());
        }
        System.out.println("最大值：" + Collections.max(list) + "，最小值：" + Collections.min(list));
    }
}

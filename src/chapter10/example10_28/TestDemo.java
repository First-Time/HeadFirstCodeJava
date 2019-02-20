package chapter10.example10_28;

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int data[] = new int[]{1, 5, 6, 2, 3, 4, 9, 8, 7, 10};
        Arrays.sort(data);
        for (int x : data) {
            System.out.print(x + "、");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(data, 9));
    }
}

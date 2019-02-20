package chapter10.example10_17;

import java.util.Arrays;
import java.util.Random;

public class TestDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int data[] = new int[7];
        int foot = 0;               //此为数组操作脚标
        while (foot < 7) {
            int t = random.nextInt(37);
            if (!isRepeat(data, t)) {
                data[foot++] = t;
            }
        }

        Arrays.sort(data);

        for (int x = 0; x < 7; x++) {
            System.out.print(data[x] + "、");
        }
    }

    private static boolean isRepeat(int temp[], int num) {
        if (num == 0) {
            return true;
        }
        for (int i : temp) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}

package chapter11.exercises5_3;

import java.io.IOException;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        int data[];
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字字符串：");
        byte bArr[] = scanner.next().getBytes();
        data = new int[bArr.length];
        for (int x = 0; x < bArr.length; x++) {
            data[x] = (int) bArr[x];
        }
        int evenCount = 0;
        int oddCount = 0;
        for (int x = 0; x < data.length; x++) {
            if (isEven(data[x])) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("您输入的数字字符串中有" + evenCount + "个偶数" + oddCount + "个奇数");
    }

    /**
     * 判断数字是否是偶数
     *
     * @param temp
     * @return
     */
    private static boolean isEven(int temp) {
        if (temp % 2 == 0) {
            return true;
        }
        return false;
    }
}

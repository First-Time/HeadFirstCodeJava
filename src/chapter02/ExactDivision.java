package chapter02;

import java.util.Scanner;

public class ExactDivision {
    public static void main(String args[]) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0) {
                System.out.println(num + "能被3、5、7整除");
            } else {
                System.out.println(num + "不能被3、5、7整除");
            }
        }
    }
}

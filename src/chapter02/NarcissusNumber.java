package chapter02;

/**
 * 计算100~1000的"水仙花数"
 * "水仙花数"是指一个三位数，其个位数字立方和等于该数本身。
 */
public class NarcissusNumber {
    public static void main(String args[]) {
        for (int num = 100; num < 1000; num++) {
            int i = num / 100;
            int j = num / 10 % 10;
            int k = num % 10;
            if(num == i * i * i + j * j * j + k * k * k) {
                System.out.println("水仙花数：" + num);
            }
        }
    }
}

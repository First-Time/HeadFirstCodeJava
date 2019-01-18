package chapter02;

public class CirculationSummation {
    public static void main(String args[]) {
        //while循环求和
        /*int result = 0;
        int num = 100;
        while(num <= 200) {
            result += num;
            num++;
        }
        System.out.println("计算结果：" + result);*/


        //do...while循环求和
        /*int result = 0;
        int num = 100;
        do {
            result += num;
            num++;
        } while (num <= 200);
        System.out.println("计算结果：" + result);*/


        //for循环求和
        int result = 0;
        for (int num = 100; num <= 200; num++) {
            result += num;
        }
        System.out.println("计算结果：" + result);
    }
}

package chapter02;

/**
 * 通过代码完成两个整数的交换
 */
public class IntegerChange {
    public static void main(String args[]) {
        //引入第三方变量
        /*int int1 = 100;
        int int2 = 888;
        int temp = int1;
        int1 = int2;
        int2 = temp;
        System.out.println("int1的值为：" + int1);
        System.out.println("int2的值为：" + int2);*/

        //利用数学计算完成
        /*int int1 = 100;
        int int2 = 888;
        int2 = int1 + int2;
        int1 = int2 - int1;
        int2 = int2 - int1;
        System.out.println("int1的值为：" + int1);
        System.out.println("int2的值为：" + int2);*/

        int int1 = 100;
        int int2 = 888;
        int1 = int1 + int2;
        int2 = int1 - int2;
        int1 = int1 - int2;
        System.out.println("int1的值为：" + int1);
        System.out.println("int2的值为：" + int2);
    }
}

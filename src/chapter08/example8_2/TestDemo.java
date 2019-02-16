package chapter08.example8_2;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println(add(new int[]{1, 2, 3}));
        System.out.println(add(new int[]{10, 20}));
        System.out.println(add(1, 2, 3));
        System.out.println(add(10, 20));
        System.out.println(add());
    }

    public static int add(int... data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }
}

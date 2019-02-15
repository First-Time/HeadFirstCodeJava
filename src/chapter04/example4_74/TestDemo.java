package chapter04.example4_74;

public class TestDemo {
    public static void main(String[] args) {
        Object obj = new int[]{1, 2, 3};
        System.out.println(obj);
        if (obj instanceof int[]) {
            int data[] = (int[]) obj;
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + "、");
            }
        }
    }
}

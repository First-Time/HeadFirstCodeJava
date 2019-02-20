package chapter10.example10_38;

public class TestDemo {
    public static void main(String[] args) {
        String str = "yootk9mldnyo8798o5555tk";
        String regex = "\\d+";
        String result[] = str.split(regex);
        for (int x = 0; x < result.length; x++) {
            System.out.println(result[x]);
        }
    }
}

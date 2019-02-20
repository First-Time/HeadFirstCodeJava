package chapter10.example10_35;

public class TestDemo {
    public static void main(String[] args) {
        String str = "123yootk";
        System.out.println(isNumber(str));
    }

    private static boolean isNumber(String temp) {
        if (temp == null || "".equals(temp)) {
            return false;
        }
        char data[] = temp.toCharArray();
        for (int x = 0; x < data.length; x++) {
            if (data[x] > '9' || data[x] < '0') {
                return false;
            }
        }
        return true;
    }
}

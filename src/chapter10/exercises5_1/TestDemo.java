package chapter10.exercises5_1;

public class TestDemo {
    public static void main(String[] args) {
        /*StringBuffer sb = new StringBuffer();
        for (int x = 97; x <= 122; x++) {
            sb.append((char) x);
        }
        System.out.println(sb);*/

        StringBuffer sb = new StringBuffer();
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}

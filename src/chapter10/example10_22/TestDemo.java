package chapter10.example10_22;

import java.util.Date;

public class TestDemo {
    public static void main(String[] args) {
        long cur = System.currentTimeMillis();
        Date date = new Date(cur);
        System.out.println(date);
        System.out.println(date.getTime());
    }
}

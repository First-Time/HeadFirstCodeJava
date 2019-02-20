package chapter10.example10_23;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH-mm-ss");
        String str = sdf.format(date);
        System.out.println(str);
    }
}

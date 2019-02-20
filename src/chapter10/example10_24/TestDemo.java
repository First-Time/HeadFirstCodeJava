package chapter10.example10_24;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDemo {
    public static void main(String[] args) throws ParseException {
        String str = "2019-02-20 15:03:32";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);
    }
}

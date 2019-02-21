package chapter10.exercises5_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDemo {
    public static void main(String[] args) throws ParseException {
        String str = "2019-02-21 16:54:34.727";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = sdf.parse(str);
        System.out.println(date);
    }
}

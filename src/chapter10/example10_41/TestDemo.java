package chapter10.example10_41;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDemo {
    public static void main(String[] args) {
        String str = "2019-02-21";
//        String regex = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        String regex = "\\d{4}-\\d{2}-\\d{2}";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (str.matches(regex)) {
            Date date = null;
            try {
                date = sdf.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(date);
        }
    }
}

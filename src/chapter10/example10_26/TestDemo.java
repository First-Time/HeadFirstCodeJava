package chapter10.example10_26;

import java.util.Calendar;

public class TestDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        StringBuffer buf = new StringBuffer();
        buf.append(cal.get(Calendar.YEAR) + "-");
        buf.append(cal.get(Calendar.MONTH) + "-");
        buf.append(cal.get(Calendar.DAY_OF_MONTH) + " ");
        buf.append(cal.get(Calendar.HOUR_OF_DAY) + ":");
        buf.append(cal.get(Calendar.MINUTE) + ":");
        buf.append(cal.get(Calendar.SECOND));
        System.out.println(buf);
    }
}

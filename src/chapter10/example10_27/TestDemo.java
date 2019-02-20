package chapter10.example10_27;

import java.util.Calendar;

public class TestDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        StringBuffer buf = new StringBuffer();
        buf.append(cal.get(Calendar.YEAR)).append("-");
        buf.append(cal.get(Calendar.MONTH) + 1).append("-");
        buf.append(cal.get(Calendar.DAY_OF_MONTH) + 15).append(" ");
        buf.append(cal.get(Calendar.HOUR_OF_DAY)).append(":");
        buf.append(cal.get(Calendar.MINUTE)).append(":");
        buf.append(cal.get(Calendar.SECOND));
        System.out.println(buf);
    }
}

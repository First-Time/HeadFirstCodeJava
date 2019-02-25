package chapter13.example13_13;

import java.util.Enumeration;
import java.util.Vector;

public class TestDemo {
    public static void main(String[] args) {
        Vector<String> all = new Vector<>();
        all.add("www.jixianit.com");
        all.add("www.yootk.com");
        all.add("www.mldn.cn");
        Enumeration<String> enu = all.elements();
        while (enu.hasMoreElements()) {
            String str = enu.nextElement();
            System.out.println(str);
        }
    }
}

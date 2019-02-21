package chapter10.example10_60;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestDemo {
    public static void main(String[] args) {
        Locale zhLoc = new Locale("zh", "CN");
        Locale enLoc = new Locale("en", "US");
        ResourceBundle zhRb = ResourceBundle.getBundle("chapter10.example10_60.Message", zhLoc);
        ResourceBundle enRb = ResourceBundle.getBundle("chapter10.example10_60.Message", enLoc);
        System.out.println(MessageFormat.format(zhRb.getString("yootk.info"), "www.yootk.com"));
        System.out.println(MessageFormat.format(enRb.getString("yootk.info"), "www.yootk.com"));
    }
}

package chapter10.example10_58;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class TestDemo {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("chapter10.example10_58.Message");
        System.out.println(MessageFormat.format(rb.getString("yootk.info"), "www.yootk.com", "李兴华"));
    }
}

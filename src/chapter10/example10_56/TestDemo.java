package chapter10.example10_56;

import java.util.ResourceBundle;

public class TestDemo {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("chapter10.example10_56.Message");
        System.out.println(rb.getString("yootk.info"));
    }
}

package chapter13.example13_20;

import java.util.Properties;

public class TestDemo {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("BJ", "北京");
        pro.setProperty("TJ", "天津");
        System.out.println(pro.getProperty("BJ"));
        System.out.println(pro.getProperty("GZ"));
        System.out.println(pro.getProperty("GZ", "没有此记录"));
    }
}

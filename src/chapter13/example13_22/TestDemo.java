package chapter13.example13_22;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.load(new FileInputStream(new File("E:" + File.separator + "area.properties")));
        System.out.println(pro);
        System.out.println(pro.getProperty("BJ"));
    }
}

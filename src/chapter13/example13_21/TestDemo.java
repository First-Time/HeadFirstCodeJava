package chapter13.example13_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.setProperty("BJ", "北京");
        pro.setProperty("TJ", "天津");
        pro.store(new FileOutputStream(new File("E:" + File.separator + "area.properties")), "Area Info");
    }
}

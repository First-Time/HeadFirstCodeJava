package chapter13.example13_24;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        List<String> all = new ArrayList<>();
        all.add("www.jixianit.com");
        all.add("www.yootk.com");
        all.add("www.mldn.com");
        all.forEach(System.out::println);
    }
}

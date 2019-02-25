package chapter13.example13_12;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("www.jixianit.com");
        all.add("www.yootk.com");
        all.add("www.mldn.cn");
        for (String str : all) {
            System.out.println(str);
        }
    }
}

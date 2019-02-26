package chapter13.example13_31;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        List<String> all = new ArrayList<>();
        all.add("www.JIXIANIT.com");
        all.add("www.yootk.com");
        all.add("www.yootk.com");
        all.add("www.mldn.com");
        all.add("www.mldn.com");
        Predicate<String> p1 = s -> s.contains("yootk");
        Predicate<String> p2 = s -> s.contains("mldn");
        Stream<String> stream = all.stream();
        if (stream.anyMatch(p1.or(p2))) {
            System.out.println("数据存在！");
        }
    }
}

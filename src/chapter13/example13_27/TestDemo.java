package chapter13.example13_27;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        List<String> all = new ArrayList<>();
        all.add("www.JIXIANIT.com");
        all.add("www.yootk.com");
        all.add("www.yootk.com");
        all.add("www.mldn.com");
        all.add("www.mldn.com");
        Stream<String> stream = all.stream();
        List<String> newList = stream.distinct()
                .filter(s -> s.contains("t"))
                .collect(Collectors.toList());
        newList.forEach(System.out::println);
    }
}

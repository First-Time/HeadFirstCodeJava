package chapter13.example13_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        System.out.println("长度：" + all.size() + "，是否为空：" + all.isEmpty());
        all.add("Hello");
        all.add("Hello");
        all.add("World");
        System.out.println("长度：" + all.size() + "，是否为空：" + all.isEmpty());
        Iterator<String> iterator = all.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

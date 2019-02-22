package chapter13.example13_2;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo {
    public static void main(String[] args) {
        Collection<String> all = new ArrayList<>();
        System.out.println("长度：" + all.size() + "，是否为空：" + all.isEmpty());
        all.add("Hello");
        all.add("Hello");
        all.add("World");
        System.out.println("长度：" + all.size() + "，是否为空：" + all.isEmpty());
        Object obj[] = all.toArray();
        for (int x = 0; x < obj.length; x++) {
            Object str = obj[x];
            System.out.println(str);
        }
    }
}

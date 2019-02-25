package chapter13.example13_6;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestDemo {
    public static void main(String[] args) {
        Set<String> all = new TreeSet<>();
        System.out.println("长度：" + all.size() + "，是否为空：" + all.isEmpty());
        all.add("c");
        all.add("d");
        all.add("a");
        all.add("b");
        all.add("e");
        all.add("abc");
        all.add("def");
        all.add("liu");
        all.add("yan");
        all.add("fei");
        all.add("mldn");
        all.add("jixmaiit");
        all.add("yootk");
        all.add("yootk");
        System.out.println("长度：" + all.size() + "，是否为空：" + all.isEmpty());
        for (Iterator<String> iterator = all.iterator(); iterator.hasNext(); ) {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}

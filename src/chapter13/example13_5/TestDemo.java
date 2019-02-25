package chapter13.example13_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestDemo {
    public static void main(String[] args) {
        Set<String> all = new HashSet<>();
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
        all.add("1");
        all.add("21");
        all.add("3");
        all.add("4");
        all.add("5");
        System.out.println("长度：" + all.size() + "，是否为空：" + all.isEmpty());

        Object strArray[] = all.toArray();

        for (int x = 0; x < strArray.length; x++) {
            System.out.print(strArray[x] + "、");
        }
        System.out.println();

        for (Iterator<String> it = all.iterator(); it.hasNext(); ) {
            String str = it.next();
            System.out.print(str + "、");
        }
        System.out.println();

        System.out.println(all);
    }
}

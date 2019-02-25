package chapter13.example13_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("Hello");
        all.add("mldn");
        all.add("World");
        all.add("Yootk");
        Iterator<String> iterator = all.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if ("mldn".equals(str)) {
                all.remove(str);
//                iterator.remove();
            }
            System.out.println(str);
        }

        System.out.println(all);
    }
}

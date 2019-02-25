package chapter13.example13_11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("www.jixianit.com");
        all.add("www.yootk.com");
        all.add("www.mldn.cn");
        System.out.print("由前向后输出：");
        ListIterator<String> iterator = all.listIterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.print(str + "、");
        }
        System.out.println();
        System.out.print("由后向前输出：");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + "、");
        }
    }
}

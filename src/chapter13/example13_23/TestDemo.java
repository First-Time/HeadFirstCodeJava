package chapter13.example13_23;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        List<String> all = new ArrayList<>();
        Collections.addAll(all, "jixnanit", "mldn", "yootk", "mldnjava", "lixinghua");
        Collections.reverse(all);
        System.out.println(all);
    }
}

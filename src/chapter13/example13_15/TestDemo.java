package chapter13.example13_15;

import java.util.HashMap;
import java.util.Map;

public class TestDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("壹", 1);
        map.put("贰", 2);
        map.put("叁", 3);
        map.put("叁", 33);
        map.put("空", null);
        map.put(null, 0);
        System.out.println(map.get("壹"));
        System.out.println(map.get("陆"));
        System.out.println(map.get(null));
    }
}

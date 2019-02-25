package chapter13.example13_16;

import java.util.Hashtable;
import java.util.Map;

public class TestDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>();
        map.put("壹", 1);
        map.put("贰", 2);
        map.put("叁", 3);
        map.put("叁", 33);
        System.out.println(map.get("壹"));
        System.out.println(map.get("陆"));
    }
}

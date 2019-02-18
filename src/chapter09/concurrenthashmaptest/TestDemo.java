package chapter09.concurrenthashmaptest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("刘燕霏", "100");
        concurrentHashMap.put("刘德华", "200");
        concurrentHashMap.put("刘燕霏", "300");
//        concurrentHashMap.remove("刘燕霏");
        System.out.println(concurrentHashMap.putIfAbsent("刘燕霏1", "400"));

        for (Map.Entry<String, String> entry : concurrentHashMap.entrySet()) {
            System.out.println(entry.getKey() + "、" + entry.getValue());
        }
    }
}

package chapter13.example13_17;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>();
        map.put("壹", 1);
        map.put("贰", 2);
        map.put("叁", 3);
        map.put("叁", 33);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iter = set.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> me = iter.next();
            System.out.println(me.getKey() + " = " + me.getValue());
        }
    }
}

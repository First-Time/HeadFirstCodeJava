package chapter13.example13_19;

import java.util.Stack;

public class TestDemo {
    public static void main(String[] args) {
        Stack<String> all = new Stack<>();
        all.push("www.jixianit.com");
        all.push("www.yootk.com");
        all.push("www.mldn.com");
        System.out.println(all.pop());
        System.out.println(all.pop());
        System.out.println(all.pop());
        System.out.println(all.pop());
    }
}

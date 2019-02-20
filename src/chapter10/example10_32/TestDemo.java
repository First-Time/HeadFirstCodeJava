package chapter10.example10_32;

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(new Book("Java开发实战经典", 79.9));
        bt.add(new Book("JavaWeb开发实战经典", 69.9));
        bt.add(new Book("Oracle开发实战经典", 99.9));
        bt.add(new Book("Android开发实战经典", 89.9));
        Object obj[] = bt.toArray();
        System.out.println(Arrays.toString(obj));
        
    }
}

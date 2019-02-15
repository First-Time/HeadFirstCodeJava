package chapter04.example4_73;

public class TestDemo {
    public static void main(String[] args) {
        Object book1 = new Book("Java开发", 79.9);
        Object book2 = new Book("Java开发", 79.9);
        System.out.println(book1.equals(book2));
    }
}

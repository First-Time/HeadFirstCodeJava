package chapter08.example8_53;

public class TestDemo {
    public static void main(String[] args) {
        IMessage<Book> msg = Book::new;
        System.out.println(msg.create("Java开发实战经典", 79.8));
    }
}

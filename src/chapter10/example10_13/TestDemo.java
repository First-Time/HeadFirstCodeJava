package chapter10.example10_13;

public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book bookA = new Book("Java开发", 79.8);
        Book bookB = (Book) bookA.clone();
        bookB.setTitle("JSP开发");
        System.out.println(bookA);
        System.out.println(bookB);
    }
}

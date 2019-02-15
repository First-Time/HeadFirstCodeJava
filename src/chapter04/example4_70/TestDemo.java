package chapter04.example4_70;

public class TestDemo {
    public static void main(String[] args) {
        Object obja = new Book();
        Object objb = "hello";
        Book b = (Book) obja;
        String s = (String) objb;
    }
}

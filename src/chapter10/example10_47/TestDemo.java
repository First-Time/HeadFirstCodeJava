package chapter10.example10_47;

public class TestDemo {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("chapter10.example10_47.Book");
            Book book = (Book) cls.newInstance();
            System.out.println(book);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}

package chapter10.example10_49;

public class TestDemo {
    public static void main(String[] args) {
        try {
            Book book = (Book) Class.forName("chapter10.example10_49.Book").newInstance();
            System.out.println(book);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

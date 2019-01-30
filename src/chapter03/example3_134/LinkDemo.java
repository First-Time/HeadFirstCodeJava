package chapter03.example3_134;

public class LinkDemo {
    public static void main(String args[]) {
        Link all = new Link();
        all.add(new Book("Java开发实战经典", 79.8));
        all.add(new Book("Oracle开发实战经典", 89.8));
        all.add(new Book("Android开发实战经典", 99.8));
        System.out.println("保存数的个数：" + all.size());
        System.out.println(all.contains(new Book("Java开发实战经典", 79.8)));
        all.remove(new Book("Android开发实战经典", 99.8));
        Book[] books = all.toArray();
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getInfo());
        }
    }
}

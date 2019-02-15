package chapter03.example3_101;

public class Book {

    public static String msg;          //static属性，暂不封装

    {
        System.out.println("【X】Book类的构造方法");
    }

    public Book() {
        System.out.println("【A】Book类的构造方法");
    }

    static {
        msg = "Hello".substring(0, 2);
        System.out.println("【C】Book类的构造方法");
    }
}

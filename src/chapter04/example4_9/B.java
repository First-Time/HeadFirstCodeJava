package chapter04.example4_9;

public class B extends A {                          //B是子类，继承父类A
    public B(String title) {                        //子类提供有参构造
        super(title);                               //明确调用父类构造，否则将出现编译错误
        System.out.println("B、B类的构造方法！");
    }
}

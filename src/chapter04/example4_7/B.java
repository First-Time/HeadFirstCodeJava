package chapter04.example4_7;

public class B extends A {                          //B是子类，继承父类A
    public B() {                                    //定义子类的构造方法
        super();                                    //父类中有无参构造方法时加与不加无区别，如果编写则必须出现在首行
        System.out.println("X、B类的构造方法！");
    }
}

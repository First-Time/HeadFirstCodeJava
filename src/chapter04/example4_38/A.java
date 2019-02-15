package chapter04.example4_38;

public abstract class A {                               //定义一个抽象类，使用abstract声明
    public void fun() {                                 //普通方法
        System.out.println("存在有方法体的方法！");
    }

    //此方法并没有方法体的声明，并且存在abstract关键字，表示抽象方法
    public abstract void print();
}

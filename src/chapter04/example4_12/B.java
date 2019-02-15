package chapter04.example4_12;

public class B extends A {                          //定义子类，此时没有覆写任何方法
    public void fun() {                             //此处为覆写
        System.out.println("B类中的fun()方法。");
    }
}

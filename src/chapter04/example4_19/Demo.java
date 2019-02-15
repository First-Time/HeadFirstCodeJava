package chapter04.example4_19;

public class Demo {
    public static void main(String[] args) {
        B b = new B();      //实例化子类对象
        b.print();            //调用fun()方法，此时方法被覆写，所以调用被覆写过的方法
    }
}

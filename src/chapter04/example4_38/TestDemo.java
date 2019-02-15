package chapter04.example4_38;

public class TestDemo {
    public static void main(String[] args) {
        A a = new B();      //向上转型
        a.print();          //被子类覆写过的方法
    }
}

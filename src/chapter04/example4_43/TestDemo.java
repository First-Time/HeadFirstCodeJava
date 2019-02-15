package chapter04.example4_43;

public class TestDemo {
    public static void main(String[] args) {
        //此时取出抽象类对象时完全不需要知道B类这个子类存在
        A a = A.getInstance();
        a.print();                  //调用被覆写过的子类方法
    }
}

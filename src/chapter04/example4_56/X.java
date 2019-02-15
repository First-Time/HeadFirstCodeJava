package chapter04.example4_56;

public class X extends C implements A, B {

    @Override
    public void print() {
        System.out.println("A接口的抽象方法！");
    }

    @Override
    public void get() {
        System.out.println("B接口的抽象方法！");
    }

    @Override
    public void change() {
        System.out.println("C类的抽象方法！");
    }
}

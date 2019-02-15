package chapter04.example4_35;

public class B extends A {
    @Override
    public void print() {
        System.out.println("X、public void print(){}");
    }

    public void funB() {
        System.out.println("X、扩充的funB()方法");
    }
}

package chapter04.example4_44;

/**
 * 在任何一个类的构造执行完前，所有属性的内容都是其对应数据类型的默认值。
 */
public class B extends A {

    private int num = 100;

    public B(int num) {
        this.print();
        this.num = num;
        this.print();
    }

    @Override
    public void print() {
        System.out.println("num = " + this.num);
    }
}

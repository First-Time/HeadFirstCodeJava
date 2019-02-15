package chapter04.example4_44;

/**
 * 在任何一个类的构造执行完前，所有属性的内容都是其对应数据类型的默认值。
 */
public abstract class A {                               //定义一个抽象类
    public A() {
        this.print();
    }

    /**
     * 此方法为抽象方法，所以要调用子类中已经被覆写过的方法
     */
    public abstract void print();                       //定义抽象方法
}

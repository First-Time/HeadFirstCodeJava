package chapter04.example4_41;

/**
 * 外部抽象类不允许使用static声明，而内部的抽象类允许使用static声明，
 * 使用static声明的内部抽象类就相当于一个外部抽象类，继承的时候使用“外部类.内部类”的形式表示类名称。
 */
public abstract class A {                               //定义一个抽象类
    static abstract class B {                                  //static定义的内部抽象类属于外部类
        public abstract void print();
    }
}

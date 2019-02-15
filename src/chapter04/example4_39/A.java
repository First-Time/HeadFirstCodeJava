package chapter04.example4_39;

/**
 * 抽象类中可以没有任何抽象方法，但是只要是抽象类，就不能直接使用关键字new实例化对象。
 */
public abstract class A {                               //定义一个抽象类
    //此为普通方法
    public void print() {
        System.out.println("更多课程请访问：www.yootk.com");
    }
}

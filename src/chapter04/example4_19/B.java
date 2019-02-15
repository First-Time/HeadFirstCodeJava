package chapter04.example4_19;

public class B extends A {                          //定义子类，此时没有覆写任何方法
    public void print() {                             //此处为覆写
        super.print();                                //访问父类中的print()方法
        System.out.println("更多课程请访问：www.yookt.com");
    }
}

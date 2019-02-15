package chapter04.example4_20;

public class B extends A {                          //定义子类，此时没有覆写任何方法
   int info = 100;              //名称相同，发生属性覆盖
    public void print() {
        System.out.println(super.info);
        System.out.println(this.info);
    }
}

package chapter04.example4_6;

public class Demo {
    public static void main(String[] args) {
        B b = new B();
        b.setMsg("Hello");                  //设置msg属性，属性通过A类继承
        System.out.println(b.getMsg());     //通过子类对象取得msg属性
    }
}

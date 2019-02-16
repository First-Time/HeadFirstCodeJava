package chapter08.example8_41;

public interface IMessage {
    public void print();

    default void fun() {    //在接口里面定义了一个普通的方法
        System.out.println("更多课程请访问：www.yootk.com");
    }
}

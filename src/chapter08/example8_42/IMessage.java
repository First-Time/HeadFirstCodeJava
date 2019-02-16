package chapter08.example8_42;

public interface IMessage {
    public void print();

    static void get() {    //在接口里面定义了一个普通的方法
        System.out.println("更多课程请访问：www.yootk.com");
    }
}

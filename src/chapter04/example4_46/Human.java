package chapter04.example4_46;

public class Human extends Action {
    @Override
    public void eat() {
        System.out.println("人类正在吃饭！");
    }

    @Override
    public void sleep() {
        System.out.println("人类正在睡觉休息！");
    }

    @Override
    public void work() {
        System.out.println("人为了梦想在努力工作！");
    }
}

package chapter04.example4_46;

public class Pig extends Action {
    @Override
    public void eat() {
        System.out.println("猪正在啃食槽！");
    }

    @Override
    public void sleep() {
        System.out.println("猪在睡觉养膘！");

    }

    @Override
    public void work() {
    }
}

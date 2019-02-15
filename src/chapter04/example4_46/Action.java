package chapter04.example4_46;

import javafx.concurrent.Worker;

public abstract class Action {                       //定义一个抽象的行为类，行为不是具体的
    //定义常量时必须保证两个内容相加的结果不是其他行为，例如：EAT + SLEEP = 6，不会和其他值冲突
    public static final int EAT = 1;        //定义吃的命令
    public static final int SLEEP = 5;      //定义睡的命令
    public static final int WORK = 7;       //定义工作的命令

    /**
     * 控制操作的行为，所有的行为都通过类中的常量描述，可以使用EAT、SLEEP、WORK
     * 或者进行命令的叠加，例如：边吃边工作，使用EAT + WORK来描述
     *
     * @param flag 操作的行为标记
     */
    public void command(int flag) {
        switch (flag) {                 //switch只支持数值判断，而if支持条件判断
            case EAT:                   //当前为吃的操作
                this.eat();             //调用子类中具体的“吃”方法
                break;
            case SLEEP:
                this.sleep();
                break;
            case WORK:
                this.work();
                break;
            case EAT + WORK:
                this.eat();
                this.work();
                break;
        }
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void work();
}

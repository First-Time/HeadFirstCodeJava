package chapter04.example4_46;

public class TestDemo {

    public static void main(String[] args) {
        fun(new Robot());
        fun(new Human());
        fun(new Pig());
    }

    private static void fun(Action act) {
        act.command(Action.EAT);
        act.command(Action.SLEEP);
        act.command(Action.WORK);
    }
}

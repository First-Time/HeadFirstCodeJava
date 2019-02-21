package chapter10.example10_48;

public class TestDemo {
    public static void main(String[] args) {
        Fruit apple = Factory.getInstance("chapter10.example10_48.Apple");
        Fruit orange = Factory.getInstance("chapter10.example10_48.Orange");
        apple.eat();
        orange.eat();
    }
}

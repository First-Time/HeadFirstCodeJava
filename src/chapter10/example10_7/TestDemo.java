package chapter10.example10_7;

public class TestDemo {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println(run.maxMemory());
        System.out.println(run.totalMemory());
        System.out.println(run.freeMemory());
    }
}

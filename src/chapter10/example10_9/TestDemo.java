package chapter10.example10_9;

public class TestDemo {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        String str = "";
        for (int x = 0; x < 2000; x++) {
            str += x;
        }

        System.out.println("【垃圾处理前内存量】MAX = " + run.maxMemory());
        System.out.println("【垃圾处理前内存量】TOTAL = " + run.totalMemory());
        System.out.println("【垃圾处理前内存量】FREE = " + run.freeMemory());
        run.gc();
        System.out.println("【垃圾处理后内存量】MAX = " + run.maxMemory());
        System.out.println("【垃圾处理后内存量】TOTAL = " + run.totalMemory());
        System.out.println("【垃圾处理后内存量】FREE = " + run.freeMemory());
    }
}

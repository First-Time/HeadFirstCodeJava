package chapter02;

public class Singleton {
    private volatile static Singleton ourInstance;
    private static int a;
    private static int b;
    private static int c;

    public static Singleton getInstance() {
        if (ourInstance == null) {
            synchronized (Singleton.class) {
                if (ourInstance == null) {
                    a = 1;
                    System.out.println("a:" + a);
                    b = 2;
                    System.out.println("b:" + b);
                    ourInstance = new Singleton();
                    c = a + b;
                    System.out.println("c:" + c);
                }
            }
        }
        return ourInstance;
    }

    private Singleton() {
    }
}

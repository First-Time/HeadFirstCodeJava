package chapter01;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        System.out.println("我喜爱学习Java");
        System.out.println("********************");
        System.out.println("****Java程序设计****");
        System.out.println("********************");*/

        /*String s = null;
        assert  s != null ? true : false;
//        assert false;
        System.out.println("end");*/

        float aFloat = 0.6710f;
        double aDouble = 0.041504353453d;
        double sum = aFloat * aDouble;
        float quotient = (float) (aFloat / aDouble);
        System.out.println("float: " + aFloat);
        System.out.println("double: " + aDouble);
        System.out.println("sum: " + sum);
        System.out.println("quotient: " + quotient);
    }
}

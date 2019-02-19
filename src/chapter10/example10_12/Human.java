package chapter10.example10_12;

public class Human {
    public Human() {
        System.out.println("欢天喜地，一个健康的孩子诞生了。");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("活了250年，到时候了！");
        throw new Exception("此处即使抛出异常对象也不会产生任何影响!");
    }
}

package chapter03.example3_105;

public class Outer {
    private String msg = "Hello World!";

    public void fun() {
        Inner inner = new Inner();
        System.out.println(inner.info);
    }

    class Inner {
        private String info = "世界，你好！";

        public void print() {
            System.out.println(Outer.this.msg);
        }
    }
}

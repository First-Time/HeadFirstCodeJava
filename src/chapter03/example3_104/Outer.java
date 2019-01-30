package chapter03.example3_104;

public class Outer {
    private String msg = "Hello World!";

    public String getMsg() {
        return msg;
    }

    public void fun() {
        new Inner(this).print();
    }
}

class Inner {
    private Outer outer;

    public Inner(Outer outer) {
        this.outer = outer;
    }

    public void print() {
        System.out.println(this.outer.getMsg());
    }
}

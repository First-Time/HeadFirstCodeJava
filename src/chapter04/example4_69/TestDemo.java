package chapter04.example4_69;

public class TestDemo {
    public static void main(String[] args) {
        Network network = null;
        network = new Proxy(new Real());
        network.browse();
    }
}

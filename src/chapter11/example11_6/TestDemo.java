package chapter11.example11_6;

public class TestDemo {
    public static void main(String[] args) {
        try(Net n = new Net()) {
            n.info();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*Net n = new Net();
        try {
            n.info();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}

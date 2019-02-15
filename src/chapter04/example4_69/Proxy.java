package chapter04.example4_69;

public class Proxy implements Network {

    private Network network;

    public Proxy(Network network) {
        this.network = network;
    }

    private void check() {
        System.out.println("检查用户是否合法");
    }

    @Override
    public void browse() {
        this.check();
        this.network.browse();
    }
}

package chapter08.example8_24;

public class Message<T extends Number> {
    private T msg;

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }
}

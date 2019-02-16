package chapter08.example8_32;

public enum Color implements IMessage {

    RED("红色"), GREEN("绿色"), BLUE("蓝色");

    private String title;

    Color(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}

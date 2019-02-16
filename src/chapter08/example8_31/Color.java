package chapter08.example8_31;

public enum Color {
    RED("红色"), GREEN("绿色"), BLUE("蓝色");

    private String title;

    Color(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}

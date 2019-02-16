package chapter08.example8_40;

public class Book<T> {
    private T title;

    public T getTitle() {
        return title;
    }

    public void setTitle(T title) {
        this.title = title;
    }
}

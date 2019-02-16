package chapter08.example8_36;

public enum Sex {
    MALE("男"), FEMALE("女");

    private String title;

    Sex(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}

package chapter08.example8_33;

public enum Color implements IMessage {

    RED("红色") {
        @Override
        public String getTitle() {
            return this + "-red";
        }
    }, GREEN("绿色") {
        @Override
        public String getTitle() {
            return this + "-greed";
        }
    }, BLUE("蓝色") {
        @Override
        public String getTitle() {
            return this + "-blue";
        }
    };

    private String title;

    Color(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}

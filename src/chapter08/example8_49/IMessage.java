package chapter08.example8_49;

@FunctionalInterface
public interface IMessage {
    int add(int... args);

    static int sum(int... args) {
        int sum = 0;
        for (int x : args) {
            sum += x;
        }
        return sum;
    }
}

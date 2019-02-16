package chapter08.example8_53;

@FunctionalInterface
public interface IMessage<C> {
    C create(String t, double p);
}

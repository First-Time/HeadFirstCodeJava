package chapter08.example8_51;

@FunctionalInterface
public interface IMessage<P> {
    int compare(P p1, P p2);
}

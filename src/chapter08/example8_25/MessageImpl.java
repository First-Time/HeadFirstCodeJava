package chapter08.example8_25;

/*public class MessageImpl<S> implements IMessage<S> {

    @Override
    public void print(S s) {
        System.out.println(s);
    }
}*/

public class MessageImpl implements IMessage<String> {

    @Override
    public void print(String s) {
        System.out.println(s);
    }
}

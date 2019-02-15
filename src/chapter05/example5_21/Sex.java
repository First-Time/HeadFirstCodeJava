package chapter05.example5_21;
import static java.lang.Integer.*;

public class Sex {
    private String title;
    private static final Sex MALE = new Sex("男");
    private static final Sex FEMALE = new Sex("女");

    public Sex(String title) {
        this.title = title;
        System.out.println(toHexString(1));
    }

    public static Sex getInstance(int ch) {
        switch (ch) {
            case 1:
                return MALE;
            case 2:
                return FEMALE;
            default:
                return null;
        }
    }
}

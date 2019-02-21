package chapter10.example10_45;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDemo {
    public static void main(String[] args) {
        String str = "100";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
    }
}

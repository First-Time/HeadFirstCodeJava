package chapter10.example10_44;

import java.util.Arrays;
import java.util.regex.Pattern;

public class TestDemo {
    public static void main(String[] args) {
        String str = "hello1yootk30mldn886liuyanfei";
        Pattern pattern = Pattern.compile("\\d+");
        String data[] = pattern.split(str);
        System.out.println(Arrays.toString(data));
    }
}

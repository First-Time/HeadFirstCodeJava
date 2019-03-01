package chapter11.example11_28;

import java.io.IOException;
import java.io.OutputStream;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        OutputStream out = System.out;
        out.write("www.yootk.com".getBytes());
    }
}

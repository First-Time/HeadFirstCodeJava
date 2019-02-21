package chapter12.example12_2;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class HelloClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        Scanner scanner = new Scanner(socket.getInputStream());
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            System.out.println("回应数据：" + scanner.next());
        }
        scanner.close();
        socket.close();
    }
}

package chapter12.example12_4;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        input.useDelimiter("\n");
        scanner.useDelimiter("\n");
        boolean flag = true;
        while (flag) {
            System.out.println("请输入要发送数据：");
            if (input.hasNext()) {
                String sendStr = input.next();
                out.println(sendStr);
                if (sendStr.equalsIgnoreCase("byebye")) {
                    flag = false;
                }
                if (scanner.hasNext()) {
                    System.out.println(scanner.next());
                }
            }
        }
        out.close();
        input.close();
        scanner.close();
        socket.close();
    }
}

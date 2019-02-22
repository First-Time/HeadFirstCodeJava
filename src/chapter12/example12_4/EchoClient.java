package chapter12.example12_4;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost", 9999);
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(clientSocket.getInputStream());
        PrintStream out = new PrintStream(clientSocket.getOutputStream());
        input.useDelimiter("\n");
        in.useDelimiter("\n");
        boolean flag = true;
        while (flag) {
            System.out.println("请输入要发送数据：");
            if (input.hasNext()) {
                String sendStr = input.next();
                out.println(sendStr);
                if (sendStr.equalsIgnoreCase("byebye")) {
                    flag = false;
                }
                if (in.hasNext()) {
                    System.out.println(in.next());
                }
            }
        }
        out.close();
        input.close();
        in.close();
        clientSocket.close();
    }
}

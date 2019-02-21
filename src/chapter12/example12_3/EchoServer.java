package chapter12.example12_3;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待客户端连接......");
        Socket socket = serverSocket.accept();
        Scanner scanner = new Scanner(socket.getInputStream());
        PrintStream printStream = new PrintStream(socket.getOutputStream());
        boolean flag = true;
        while (flag) {
            if (scanner.hasNext()) {
                String clientStr = scanner.next();
                System.out.println(clientStr);
                if (clientStr.equalsIgnoreCase("byebye")) {
                    printStream.println("拜拜，下次再会！");
                    flag = false;
                } else {
                    printStream.println("ECHO：" + clientStr);
                }
            }
        }
        printStream.close();
        scanner.close();
        socket.close();
        serverSocket.close();
    }

}

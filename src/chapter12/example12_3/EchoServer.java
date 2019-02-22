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
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        boolean flag = true;
        while (flag) {
            if (in.hasNext()) {
                String clientStr = in.next();
                System.out.println(clientStr);
                if (clientStr.equalsIgnoreCase("byebye")) {
                    out.println("拜拜，下次再会！");
                    flag = false;
                } else {
                    out.println("ECHO：" + clientStr);
                }
            }
        }
        out.close();
        in.close();
        socket.close();
        serverSocket.close();
    }

}

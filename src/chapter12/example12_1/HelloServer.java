package chapter12.example12_1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待客户端连接......");
        Socket socket = serverSocket.accept();
        PrintStream printStream = new PrintStream(socket.getOutputStream());
        printStream.println("Hello World!");
        printStream.close();
        socket.close();
        serverSocket.close();
    }

}

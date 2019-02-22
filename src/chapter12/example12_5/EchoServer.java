package chapter12.example12_5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        boolean flag = true;
        while (flag) {
            Socket client = serverSocket.accept();
            new Thread(new EchoThread(client)).start();
        }
        serverSocket.close();
    }
}

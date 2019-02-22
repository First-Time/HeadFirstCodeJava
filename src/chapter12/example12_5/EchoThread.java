package chapter12.example12_5;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoThread implements Runnable {

    private Socket client;

    public EchoThread(Socket client) {
        this.client = client;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try {
            Scanner in = new Scanner(client.getInputStream());
            PrintStream out = new PrintStream(client.getOutputStream());
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
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

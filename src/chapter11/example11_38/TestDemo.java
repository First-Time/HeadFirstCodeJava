package chapter11.example11_38;

import java.io.*;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        File file = new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "test.txt");
//        Scanner scanner = new Scanner(new FileReader(file));
        Scanner scanner = new Scanner(new FileInputStream(file));
//        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}

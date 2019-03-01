package chapter11.exercises5_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        File file;
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.print("请输入文件名称：");
        file = new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + scanner.next());
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
        PrintStream printStream = new PrintStream(new FileOutputStream(file, true));
        System.out.println("请输入文件内容，以over结束输入：");
        while (true) {
            String content = scanner.next();
            if (content.equals("over")) {
                break;
            }
            printStream.write(content.getBytes());
        }
        scanner.close();
        printStream.close();
    }
}

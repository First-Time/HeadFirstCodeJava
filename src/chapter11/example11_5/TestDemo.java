package chapter11.example11_5;

import java.io.File;
import java.text.ParseException;

public class TestDemo {
    public static void main(String[] args) throws ParseException {
        File file = new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java");
//        listFile(file);
        print(file);
    }

    private static void listFile(File file) {
        if (file.isDirectory()) {
            File result[] = file.listFiles();
            for (int x = 0; x < result.length; x++) {
                File file1 = result[x];
                System.out.println(file1);
                listFile(file1);
            }
        }
    }

    private static void print(File file) {
        if (file.isDirectory()) {
            File result[] = file.listFiles();
            if (result != null) {
                for (int x = 0; x < result.length; x++) {
                    print(result[x]);
                }
            }
        }
        System.out.println(file);
    }
}

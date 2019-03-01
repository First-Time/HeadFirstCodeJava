package chapter11.example11_18;

import java.io.*;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        File file = new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "mldn.txt");
        if (!file.exists()) {
            System.out.println("源文件不存在，请确认执行路径");
            System.exit(1);
        }
        File fileOut = new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "test" +
                File.separator + "mldn_copy.txt");
        if (!fileOut.getParentFile().exists()) {
            fileOut.getParentFile().mkdirs();
        }
        InputStream input = new FileInputStream(file);
        OutputStream output = new FileOutputStream(fileOut, true);
        byte data[] = new byte[1000];
        int readLen;
        if (file.exists()) {
            while ((readLen = input.read(data)) != -1) {
                output.write(data, 0, readLen);
            }
        }
        input.close();
        output.close();
    }
}

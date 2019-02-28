package chapter11.example11_3;

import java.io.File;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDemo {
    public static void main(String[] args) throws ParseException {
        File file = new File(File.separator + "Users" + File.separator + "zinclee123" +
                File.separator + "Desktop" + File.separator + "LYF" + File.separator + "Learning" +
                File.separator + "Java" + File.separator + "第一行代码Java" + File.separator + "第一行代码Java.pdf");
        if (file.exists()) {
            System.out.println("是否是文件：" + file.isFile());
            System.out.println("是否是目录：" + file.isDirectory());
            System.out.println("文件大小：" +
                    new BigDecimal(file.length() / 1000 / 1000)
                            .divide(new BigDecimal(1), 2, BigDecimal.ROUND_HALF_UP) + "M");
            System.out.println("上次修改时间：" +
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));

        }
    }
}

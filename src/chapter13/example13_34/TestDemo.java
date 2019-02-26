package chapter13.example13_34;

import java.io.IOException;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        List<Orders> all = new ArrayList<>();
        all.add(new Orders("Java开发经典实战", 79.8, 200));
        all.add(new Orders("JavaWeb开发经典实战", 69.8, 500));
        all.add(new Orders("Android开发经典实战", 89.8, 300));
        all.add(new Orders("Oracle开发经典实战", 99.0, 800));
        DoubleSummaryStatistics dss = all.stream()
                .mapToDouble(value -> value.getAmount() * value.getPrice())
                .summaryStatistics();
        System.out.println("商品个数：" + dss.getCount());
        System.out.println("总花费：" + dss.getSum());
        System.out.println("平均花费：" + dss.getAverage());
        System.out.println("最高花费：" + dss.getMax());
        System.out.println("最低花费：" + dss.getMin());
    }
}

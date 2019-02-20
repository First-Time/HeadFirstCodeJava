package chapter10.example10_20;

import java.math.BigDecimal;

public class MyMath {
    public static double round(double num, int scale) {
        BigDecimal big = new BigDecimal(num);
        BigDecimal result = big.divide(new BigDecimal(1), scale, BigDecimal.ROUND_HALF_UP);
        return result.doubleValue();
    }
}

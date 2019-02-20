package chapter10.example10_15;

import java.math.BigDecimal;

public class TestDemo {
    public static void main(String[] args) {
//        System.out.println(round(-15.678139, 2));

        BigDecimal bigDecimal1 = new BigDecimal(-14.55);
        System.out.println(bigDecimal1);

        BigDecimal bigDecimal = new BigDecimal("-14.55");
        System.out.println(bigDecimal.setScale(1, BigDecimal.ROUND_UP));
        System.out.println(bigDecimal.setScale(1, BigDecimal.ROUND_DOWN));
        System.out.println(bigDecimal.setScale(1, BigDecimal.ROUND_CEILING));
        System.out.println(bigDecimal.setScale(1, BigDecimal.ROUND_FLOOR));
        System.out.println(bigDecimal.setScale(1, BigDecimal.ROUND_HALF_UP));
        System.out.println(bigDecimal.setScale(1, BigDecimal.ROUND_HALF_DOWN));
        System.out.println(bigDecimal.setScale(1, BigDecimal.ROUND_HALF_EVEN));
        System.out.println(bigDecimal.setScale(2, BigDecimal.ROUND_UNNECESSARY));
        System.out.println();

        BigDecimal bigDecimal2 = new BigDecimal("14.55");
        System.out.println(bigDecimal2.setScale(1, BigDecimal.ROUND_UP));
        System.out.println(bigDecimal2.setScale(1, BigDecimal.ROUND_DOWN));
        System.out.println(bigDecimal2.setScale(1, BigDecimal.ROUND_CEILING));
        System.out.println(bigDecimal2.setScale(1, BigDecimal.ROUND_FLOOR));
        System.out.println(bigDecimal2.setScale(1, BigDecimal.ROUND_HALF_UP));
        System.out.println(bigDecimal2.setScale(1, BigDecimal.ROUND_HALF_DOWN));
        System.out.println(bigDecimal2.setScale(1, BigDecimal.ROUND_HALF_EVEN));
        System.out.println(bigDecimal2.setScale(2, BigDecimal.ROUND_UNNECESSARY));
    }

    private static double round(double num, int scale) {
        return Math.round(num * Math.pow(10.1, scale)) / Math.pow(10.1, scale);
    }
}

package chapter08.example8_15;

import chapter08.example8_13.Point;

public class TestDemo {
    public static void main(String[] args) {
        Point<String> p = new Point();
        p.setX("东经100度");
        p.setY("北纬20度");

        String x = p.getX();
        String y = p.getY();

        System.out.println("x坐标：" + x + "，y坐标：" + y);
    }
}

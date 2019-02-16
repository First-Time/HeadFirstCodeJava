package chapter08.example8_10;

import chapter08.example8_8.Point;

public class TestDemo {
    public static void main(String[] args) {
        Point p = new Point();
        p.setX(10.2);
        p.setY(20.3);

        double x = (double) p.getX();
        double y = (double) p.getY();

        System.out.println("x坐标：" + x + "，y坐标：" + y);
    }
}

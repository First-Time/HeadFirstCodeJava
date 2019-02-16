package chapter08.example8_17;

import chapter08.example8_13.Point;

public class TestDemo {
    public static void main(String[] args) {
        Point p = new Point();
        p.setX(10);
        p.setY(20);

        int x = (Integer) p.getX();
        int y = (Integer) p.getY();

        System.out.println("x坐标：" + x + "，y坐标：" + y);
    }
}

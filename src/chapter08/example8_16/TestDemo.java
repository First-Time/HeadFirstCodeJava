package chapter08.example8_16;

import chapter08.example8_13.Point;

public class TestDemo {
    public static void main(String[] args) {
        Point<Integer> p = new Point();
        p.setX(10);
        p.setY(20);

        int x = p.getX();
        int y = p.getY();

        System.out.println("x坐标：" + x + "，y坐标：" + y);
    }
}

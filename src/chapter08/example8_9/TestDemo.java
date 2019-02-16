package chapter08.example8_9;

import chapter08.example8_8.Point;

import static chapter08.example8_5.MyMath.add;
import static chapter08.example8_5.MyMath.div;

public class TestDemo {
    public static void main(String[] args) {
        Point p = new Point();
        p.setX(10);
        p.setY(20);

        int x = (int) p.getX();
        int y = (int) p.getY();

        System.out.println("x坐标：" + x + "，y坐标：" + y);
    }
}

package chapter08.example8_11;

import chapter08.example8_8.Point;

public class TestDemo {
    public static void main(String[] args) {
        Point p = new Point();
        p.setX("东经100度");
//        p.setY("北纬20度");
        p.setY(20);

        String x = (String) p.getX();
        String y = (String) p.getY();

        System.out.println("x坐标：" + x + "，y坐标：" + y);
    }
}

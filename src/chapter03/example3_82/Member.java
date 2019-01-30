package chapter03.example3_82;

public class Member {
    private int mid;        //人员编号
    private String name;    //人员姓名
    private Car car;        //表示属于人的车，如果没有车则内容为null

    public Member(int mid, String name) {
        this.mid = mid;
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getInfo() {
        return "人员编号：" + this.mid + "，姓名：" + this.name;
    }
}

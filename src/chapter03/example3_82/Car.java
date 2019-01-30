package chapter03.example3_82;

public class Car {
    private Member member;
    private String pname;

    public Car(String pname) {
        this.pname = pname;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getInfo() {
        return "车的名字：" + this.pname;
    }
}

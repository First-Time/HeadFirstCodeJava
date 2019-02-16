package chapter08.example8_36;

public class Member {
    private String name;
    private int age;
    private Sex sex;

    public Member(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "姓名：" + this.name + "，年龄：" + this.age + "，性别：" + this.sex;
    }
}

package chapter04.example4_2;

public class TestDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(20);
        System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge());
    }
}

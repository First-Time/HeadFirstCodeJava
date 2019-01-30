package chapter04.example4_3;

public class TestDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(20);
        stu.setSchool("清华大学");
        System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge() + "，学校：" + stu.getSchool());
    }
}

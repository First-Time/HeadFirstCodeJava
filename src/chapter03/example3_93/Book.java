package chapter03.example3_93;

public class Book {
    private String title;                   //普通属性
    private double price;                   //普通属性
    public static String pub = "清华大学出版社";      //定义一个描述出版社信息的属性，为操作方便，暂不封装

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public static void setPub(String p) {
        pub = p;
    }

    public String getInfo() {
        return "图书名称：" + this.title + "，价格：" + this.price + "，出版社：" +  pub;
    }
}

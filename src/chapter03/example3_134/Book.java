package chapter03.example3_134;

public class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    /**
     * 进行本类对象的比较，在比较过程中首先会判断传入的对象是否为null，而后判断地址是否相同
     * 如果都不相同则进行对象内容的比较，由于compare()方法接收了本类引用，所以可以直接访问私有属性
     *
     * @param book 要进行判断的数据
     * @return 内存地址相同或属性完全相同返回true，否则返回false
     */
    public boolean compare(Book book) {
        if (book == null) {                     //传入数据为null
            return false;                       //没有必要进行必要的判断
        }
        //执行"b1.compare(b2)"代码时会有两个对象
        //执行对象this（调用方法对象，就是b1引用）
        //执行对象book（调用方法对象，就是b2引用）
        if (this == book) {                     //内存地址相同
            return true;                        //避免进行具体细节的比较，节约时间
        }
        if (this.title.equals(book.title) && this.price == book.price) {    //属性判断
            return true;
        }
        return false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return "图书名称：" + this.title + "，价格：" + this.price;
    }
}

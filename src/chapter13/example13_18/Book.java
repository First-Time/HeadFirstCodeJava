package chapter13.example13_18;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String toString() {
        return "书名：" + this.title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (title == null) {
            if (book.title != null) {
                return false;
            }
        } else if (!title.equals(book.title)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }
}

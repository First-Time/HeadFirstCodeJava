package chapter03.example3_114;

public class Node {
    private String data;
    private Node next;

    /**
     * 每一个Node类对象都必须保存有相应的数据
     * @param data 要通过节点包装的数据
     */
    public Node(String data) {
        this.data = data;
    }

    /**
     * 获取当前节点包装的数据
     * @return
     */
    public String getData() {
        return data;
    }

    /**
     * 设置或修改当前节点包装的数据
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * 取得当前节点的下一个节点
     * @return 当前节点的下一个节点引用
     */
    public Node getNext() {
        return next;
    }

    /**
     * 设置下一个节点关系
     * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }
}

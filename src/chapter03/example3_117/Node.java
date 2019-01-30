package chapter03.example3_117;

public class Node {
    private String data;
    private Node next;

    /**
     * 每一个Node类对象都必须保存有相应的数据
     *
     * @param data 要通过节点包装的数据
     */
    public Node(String data) {
        this.data = data;
    }

    /**
     * 获取当前节点包装的数据
     *
     * @return
     */
    public String getData() {
        return data;
    }

    /**
     * 取得当前节点的下一个节点
     *
     * @return 当前节点的下一个节点引用
     */
    public Node getNext() {
        return next;
    }

    /**
     * 设置下一个节点关系
     *
     * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * 实现节点的添加（递归调用，目的是将新节点保存到最后一个节点之后）
     * 第一次调用（Link）：this = Link.root
     * 第二次调用（Link）：this = Link.root.next
     * 第三次调用（Link）：this = Link.root.next.next
     *
     * @param newNode 新节点，节点对象由Link类创建
     */
    public void addNode(Node newNode) {
        if (this.next == null) {            //当前节点的下一个为null
            this.setNext(newNode);          //保存新节点
        } else {                            //当前节点之后还存在节点
            this.next.addNode(newNode);     //当前节点的下一个节点继续保存
        }
    }

    /**
     * 递归的方式输出每个节点保存的数据
     * 第一次调用（Link）：this = Link.root
     * 第二次调用（Link）：this = Link.root.next
     * 第三次调用（Link）：this = Link.root.next.next
     */
    public void printNode() {
        System.out.println(this.data);
        if (this.next != null) {
            this.next.printNode();
        }
    }
}

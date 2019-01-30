package chapter03.example3_117;

public class Link {
    private Node root;

    /**
     * 向链表中增加新的数据，如果当前链表没有节点则将第一个数据作为节点
     * 如果有节点则使用Node类将新节点保存到最后一个节点之后
     *
     * @param data
     */
    public void add(String data) {
        Node newNode = new Node(data);      //设置数据的先后关系，所以将data包装到一个Node类对象中
        if (this.root == null) {            //一个链表只有一个根节点
            root = newNode;                 //将新的节点设置为根节点
        } else {                            //根节点已经存在
            this.root.addNode(newNode);     //交由Node类来进行节点保存
        }
    }

    /**
     * 使用递归方式，输出节点中的全部数据
     */
    public void print() {               //输出数据
        if (this.root != null) {        //存在根节点
            this.root.printNode();      //交由Node类输出
        }
    }
}

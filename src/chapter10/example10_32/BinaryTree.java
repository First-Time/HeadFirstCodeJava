package chapter10.example10_32;

public class BinaryTree {
    private class Node {
        private Comparable data;            //排序的依据就是Comparable
        private Node left;                  //保存左节点
        private Node right;                 //保存右节点

        public Node(Comparable data) {
            this.data = data;
        }

        public void addNode(Node newNode) {
            if (this.data.compareTo(newNode.data) > 0) {
                if (this.left == null) {
                    this.left = newNode;
                } else {
                    this.left.addNode(newNode);
                }
            } else {
                if (this.right == null) {
                    this.right = newNode;
                } else {
                    this.right.addNode(newNode);
                }
            }
        }

        public void toArrayNode() {
            if (this.left != null) {
                this.left.toArrayNode();
            }

            BinaryTree.this.retData[BinaryTree.this.foot++] = this.data;

            if (this.right != null) {
                this.right.toArrayNode();
            }
        }
    }

    private Node root;
    private int count;
    private Object[] retData;
    private int foot;
    public void add(Object obj) {
        Comparable com = (Comparable) obj;
        Node newNode = new Node(com);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;
    }

    public Object[] toArray() {
        if (this.root == null) {
            return null;
        }
        this.foot = 0;
        this.retData = new Object[this.count];
        this.root.toArrayNode();
        return this.retData;
    }
}

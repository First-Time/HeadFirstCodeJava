package chapter03.example3_134;

public class Link {

    private class Node {
        private Book data;
        private Node next;

        public Node(Book data) {
            this.data = data;
        }

        /**
         * 设置新节点的保存，所有的新节点保存在最后一个节点之后
         *
         * @param newNode 新节点对象
         */
        private void addNode(Node newNode) {
            if (this.next == null) {            //当前节点的下一个为null
                this.next = newNode;            //保存新节点
            } else {                            //当前节点之后还存在节点
                this.next.addNode(newNode);     //当前节点的下一个节点继续保存
            }
        }

        /**
         * 数据检索操作，判断指定数据是否存在
         * 第一次调用（Link）：this = Link.root
         * 第二次调用（Node）：this = Link.root.next
         *
         * @param data 要检查的数据
         * @return 如果数据存在返回true，否则返回false
         */
        private boolean containsNode(Book data) {
            if (this.data.compare(data)) {                       //当前节点数据为要查询的数据
                return true;                                    //后面不再查询
            } else {                                            //当前节点数据不满足查询条件
                if (this.next != null) {                        //有后续节点
                    return this.next.containsNode(data);        //递归调用继续查询
                } else {                                        //没有后续节点
                    return false;                               //没有查询到返回false
                }
            }
        }

        /**
         * 根据索引取出数据，此时该索引一定是存在的
         *
         * @param index 要取得数据的索引编号
         * @return 返回指定索引接点包含的数据
         */
        private Book getNode(int index) {
            //使用当前的foot内容与要查询的索引进行比较，随后将foot的内容递增，目的是下次查询方便
            if (Link.this.foot++ == index) {        //当前为要查询的索引
                return this.data;                   //返回当前节点数据
            }
            return this.next.getNode(index);        //继续向后查询，进行下一个节点的判断
        }

        /**
         * 修改指定节点包含的数据
         *
         * @param index 要修改的索引编号
         * @param data  新数据
         */
        private void setNode(int index, Book data) {
            //使用当前的foot内容与要查询的索引进行比较，随后将foot的内容递增，目的是下次查询方便
            if (Link.this.foot++ == index) {        //当前为要修改的索引
                this.data = data;                   //修改当前节点数据
            } else {
                this.next.setNode(index, data);         //继续下一个节点的索引判断
            }
        }

        /**
         * 节点的删除操作，匹配每一个节点的数据，如果当前节点数据符合删除数据，则使用"当前节点上一节点.next = 当前节点.next"方式空出当前节点
         * 第一次调用(Link):previous = Link.root、this = Link.root.next
         * 第二次调用(Node):previous = Link.root.next、this = Link.root.next.next
         *
         * @param previous 当前节点的上一个节点
         * @param data     要删除的数据
         */
        private void removeNode(Node previous, Book data) {
            if (data.compare(this.data)) {                       //当前节点为要删除的节点
                previous.next = this.next;                      //空出当前节点
            } else {                                            //应该向后继续查询
                this.next.removeNode(this, data);      //继续下一个判断
            }
        }

        /**
         * 将节点中保存的内容转化为对象数组
         * 第一次调用(Link):this = Link.root
         * 第二次调用(Link):this = Link.root.next
         *
         * @return
         */
        private void toArrayNode() {
            Link.this.retArray[Link.this.foot++] = this.data;       //取出数据并保存在数组中
            if (this.next != null) {                                //有后续数据
                this.next.toArrayNode();                            //继续下一个数据的取得
            }
        }

        /**
         * 递归的方式输出每个节点保存的数据
         */
        private void printNode() {
            System.out.println(this.data);
            if (this.next != null) {
                this.next.printNode();
            }
        }
    }

    private Node root;
    private int count = 0;
    private int foot = 0;
    private Book[] retArray;          //返回的数组

    /**
     * 向链表中增加新的数据，如果当前链表没有节点则将第一个数据作为节点
     * 如果有节点则使用Node类将新节点保存到最后一个节点之后
     *
     * @param data
     */
    public void add(Book data) {
        if (data == null) {
            return;
        }
        Node newNode = new Node(data);      //要保存的数据
        if (this.root == null) {            //当前没有根节点
            root = newNode;                 //保存根节点
        } else {                            //根节点已经存在
            this.root.addNode(newNode);     //交由Node类处理节点的保存
        }
        this.count++;
    }

    /**
     * 取得链表中保存的数据个数
     *
     * @return 保存的个数，通过count属性取得
     */
    public int size() {
        return this.count;
    }

    /**
     * 判断是否是空链表，表示长度为0，不是null
     *
     * @return 如果链表中没有保存任何数据则返回true，否则返回false
     */
    public boolean isEmpty() {
        return this.count == 0;
    }

    /**
     * 数据查询操作，判断指定数据是否存在，如果链表没有数据直接返回false
     *
     * @param data 要判断的数据
     * @return 数据存在返回true，否则返回false
     */
    public boolean contains(Book data) {
        if (data == null || this.root == null) {    //现在没有要查询的数据，根节点也没有保存数据
            return false;                           //没有查询结果
        }
        return this.root.containsNode(data);        //交由Node类处理
    }

    /**
     * 根据索引取得保存的节点数据
     *
     * @param index 索引数据
     * @return 如果要取得的索引内容不存在或者大于保存个数返回null，反之返回数据
     */
    public Book get(int index) {
        if (index >= this.count) {              //超过了查询范围
            return null;                        //没有数据
        }
        this.foot = 0;                          //表示从前向后查询
        return this.root.getNode(index);        //查询过程交给Node类
    }

    /**
     * 根据索引修改数据
     *
     * @param index 要修改数据的索引编号
     * @param data  新的数据内容
     */
    public void set(int index, Book data) {
        if (index >= this.count) {               //判断是否超过了保存范围
            return;                             //结束方法调用
        }
        this.foot = 0;                          //重新设置foot属性的内容，作为索引出现
        this.root.setNode(index, data);         //交给Node类设置数据内容
    }

    /**
     * 链表数据的删除操作，在删除前要先使用contains()判断链表中是否存在指定数据
     * 如果要删除的数据存在，则首先判断根节点的数据是否为要删除数据
     * 如果是，则将根节点的下一个节点作为新的根节点
     * 如果要删除的数据不是根节点数据，则将删除操作交给Node类的removeNode()方法完成
     *
     * @param data 要删除的数据
     */
    public void remove(Book data) {
        if (this.contains(data)) {                          //主要功能是判断数据是否存在
            //要删除数据是否是根节点数据，root是Node类的对象，此处直接访问内部类的私有操作
            if (this.root.data.compare(data)) {              //根节点数据为要删除数据
                this.root = this.root.next;                 //空出当前根节点
            } else {                                        //根节点数据不是要删除数据
                //此时根元素已经判断过了，从第二个元素开始判断，即第二个元素的上一个元素为根节点
                this.root.next.removeNode(this.root, data);
            }
            this.count--;                                   //删除成功后个数要减少
        }
    }

    /**
     * 将链表中的数据转换为对象数组输出
     *
     * @return 如果链表没有数据返回null，之所以将其定义为属性，是因为内部类和外部类都可以访问
     */
    public Book[] toArray() {
        if (this.root == null) {                    //判断链表是否有数据
            return null;                            //没有数据返回null
        }
        this.foot = 0;                              //脚标清零操作
        this.retArray = new Book[this.count];     //根据保存内容开辟数据
        this.root.toArrayNode();                    //交给Node类处理
        return this.retArray;                       //返回数组对象
    }

    /**
     * 清空链表
     */
    public void clear() {
        this.root = null;       //清空链表
        this.count = 0;         //元素个数为0
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

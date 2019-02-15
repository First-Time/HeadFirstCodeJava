package chapter04.example4_21;

public class Array {                        //定义数组操作类
    private int data[];                     //定义一个数组对象，此数组由外部设置长度
    private int foot;                       //表示数组的操作脚标

    /**
     * 构造本类对象时需要设置大小，如果设置的长度小于0则维持一个大小
     *
     * @param len 数组开辟时的长度
     */
    public Array(int len) {
        if (len > 0) {                      //设置的长度大于0
            this.data = new int[len];       //开辟一个数组
        } else {                            //设置的长度小于等于0
            this.data = new int[1];         //维持一个元素的大小
        }
    }

    /**
     * 向数组中添加元素
     *
     * @param num 要添加的数据
     * @return 如果数据增加成功返回true，如果数组中保存数据已满则返回false
     */
    public boolean add(int num) {
        if (this.foot < this.data.length) {         //有空间保存
            this.data[foot++] = num;                //保存数据，修改脚标
            return true;                            //保存成功
        }
        return false;                               //保存失败
    }

    /**
     * 取得所有的数组内容
     * @return  数组对象引用
     */
    public int[] getData() {
        return this.data;
    }
}

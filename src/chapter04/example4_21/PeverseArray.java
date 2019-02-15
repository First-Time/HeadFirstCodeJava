package chapter04.example4_21;

public class PeverseArray extends Array {
    /**
     * 构造本类对象时需要设置大小，如果设置的长度小于0则维持一个大小
     *
     * @param len 数组开辟时的长度
     */
    public PeverseArray(int len) {
        super(len);
    }

    @Override
    public int[] getData() {
        int[] temp = super.getData();
        for (int i = 0; i < temp.length / 2; i++) {
            int tempV = temp[i];
            temp[i] = temp[temp.length - i - 1];
            temp[temp.length - i - 1] = tempV;
        }
        return temp;
    }
}

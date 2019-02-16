package chapter04.example4_21;

import java.util.Arrays;

public class SortArray extends Array {          //定义排序子类

    /**
     * 构造本类对象时需要设置大小，如果设置的长度小于0则维持一个大小
     *
     * @param len 数组开辟时的长度
     */
    public SortArray(int len) {                 //Array类里面没有无参构造方法，
        super(len);                             //明确调用父类的有参构造，为父类的data属性初始化
    }

    /**
     * 因为父类中的getData()方法不能满足排序的操作要求，但为了保存这个方法名称，所以进行覆写
     * 在本方法中要使用java.example8_5.Arrays.sort()来实现数组的排序操作
     * @return 排序后的数据
     */
    @Override
    public int[] getData() {
        Arrays.sort(super.getData());       //排序
        return super.getData();             //返回排序后数据
    }
}

package chapter04.example4_21;

public class TestDemo {
    public static void main(String[] args) {
        Array arr = new Array(3);
        System.out.print(arr.add(20) + "、");
        System.out.print(arr.add(10) + "、");
        System.out.print(arr.add(30) + "、");
        System.out.println(arr.add(100) + "、");
        int[] temp = arr.getData();
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + "、");
        }
        System.out.println();

        SortArray sortArray = new SortArray(3);
        System.out.print(sortArray.add(20) + "、");
        System.out.print(sortArray.add(10) + "、");
        System.out.print(sortArray.add(30) + "、");
        System.out.println(sortArray.add(100) + "、");
        int[] temp2 = sortArray.getData();
        for (int i = 0; i < temp2.length; i++) {
            System.out.print(temp2[i] + "、");
        }
        System.out.println();

        PeverseArray peverseArray = new PeverseArray(3);
        System.out.print(peverseArray.add(20) + "、");
        System.out.print(peverseArray.add(10) + "、");
        System.out.print(peverseArray.add(30) + "、");
        System.out.println(peverseArray.add(100) + "、");
        int[] temp3 = peverseArray.getData();
        for (int i = 0; i < temp3.length; i++) {
            System.out.print(temp3[i] + "、");
        }
    }
}

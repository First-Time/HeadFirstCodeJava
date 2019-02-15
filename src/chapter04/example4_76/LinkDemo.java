package chapter04.example4_76;

public class LinkDemo {
    public static void main(String args[]) {
        Link all = new Link();
        all.add("A");
        all.add("B");
        all.add("C");
        all.remove("A");
        Object data[] = all.toArray();
        for (int i = 0; i < data.length; i++) {
            String str = (String) data[i];
            System.out.print(str + "、");
        }
    }
}

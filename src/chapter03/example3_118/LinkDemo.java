package chapter03.example3_118;

public class LinkDemo {
    public static void main(String args[]) {
        Link all = new Link();
        all.add("yoolk");
        all.add("mldn");
        System.out.println(all.contains("yoolk"));
        System.out.println(all.contains("hello"));
        System.out.println(all.size());
        System.out.println(all.isEmpty());
        System.out.println(all.get(1));
        System.out.println(all.get(2));
        System.out.println(all.get(3));
        all.set(1, "MLDN");
        all.add("刘燕霏");
        all.remove("MLDN");
        String array[] = all.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ":" + array[i]);
        }
        all.clear();
        System.out.println(all.size());
    }
}

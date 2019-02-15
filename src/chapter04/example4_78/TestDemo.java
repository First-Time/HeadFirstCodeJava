package chapter04.example4_78;

public class TestDemo {
    public static void main(String[] args) {
        PetShop petShop = new PetShop();
        petShop.add(new Cat("波斯猫", 1));
        petShop.add(new Cat("邋罗猫", 2));
        petShop.add(new Cat("波米拉猫", 1));
        petShop.add(new Dog("松狮", 1));
        petShop.add(new Dog("波尔多", 2));
        petShop.delete(new Cat("波米拉猫", 9));
        Link all = petShop.search("波");
        Object obj[] = all.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}

package chapter04.example4_78;

public class PetShop {
    private Link pets = new Link();

    public void add(Pet pet) {
        this.pets.add(pet);
    }

    public void delete(Pet pet) {
        this.pets.remove(pet);
    }

    public Link search(String keyWord) {
        Link result = new Link();
        Object obj[] = this.pets.toArray();
        for (int i = 0; i < obj.length; i++) {
            Pet pet = (Pet) obj[i];
            if (pet.getName().contains(keyWord)) {
                result.add(pet);
            }
        }
        return result;
    }
}

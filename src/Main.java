import model.*;

public class Main {
    public static void main(String argv[]) {
        Tiger animal = new Tiger(4,26);
        animal.setAnimalHabit("Love Sleeping");
        animal.setProduceMeowSound(true);
        System.out.println(animal.getAge()+", "+animal.getWeight()+", "+animal.getAnimalHabit()+", "+animal.getProduceMeowSound());
    }
}

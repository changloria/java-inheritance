package model;

public class Felidaeanimal extends Animal {
    private String animalHabit;
    public Felidaeanimal(int age, int weight) {
        super(age, weight);
    }

    public String getAnimalHabit(){
        return animalHabit;
    }

    public void setAnimalHabit(String animalHabit){
        this.animalHabit = "Habit: "+animalHabit;
    }
}

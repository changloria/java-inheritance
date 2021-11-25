package model;

public class Tiger extends Felidaeanimal {
    private String isProduceMeowSound;

    public Tiger(int age, int weight){
        super(age, weight);
    }

    public String getProduceMeowSound(){
        return isProduceMeowSound;
    }

    public void setProduceMeowSound(boolean isProduceMeowSound){
        if(isProduceMeowSound){
            this.isProduceMeowSound = "Produce Meow Sound: " + "Yes";
        }else{
            this.isProduceMeowSound = "Produce Meow Sound: " + "No";
        }
    }
}

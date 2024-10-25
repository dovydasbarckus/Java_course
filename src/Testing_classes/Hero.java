package Testing_classes;

public class Hero extends Human{

    String power;

    Hero(String name, int age, double weight, String power){
        super(name, age, weight);
        this.power = power;
    }
    public String toString() {
        return super.toString() + " \n" + this.power;

    }

}

package Testing_classes;

public class Human {


    String name;
    int age;
    double weight;
    static int humansCount;

    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        humansCount++;

    }
    static void displayHumans(){
        System.out.println("Humans: "+humansCount);

        }

    void eat(){
        System.out.println(this.name+" is eating");
    }
    public String toString() {
        return this.name + " \n" + this.age + " \n" + this.weight;

    }


}

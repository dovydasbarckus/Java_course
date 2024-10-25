package Testing_classes;

public class Classes {
    public static void main(String[] args) {

    Human human1 = new Human("Rick",25,65.05);
    human1.eat();
    System.out.println(human1);
    Human human2 = new Human("Irma", 33, 60);
    System.out.println(Human.humansCount);
    Human.displayHumans();

    Hero hero1 = new Hero("Superman",30,95,"Flying");
    System.out.println(hero1.name +" has power of " + hero1.power);
    System.out.println(hero1);

    Car car1 = new Car("Ford", 1991);
    System.out.println(car1.getYear());
    car1.setYear(2001);
    System.out.println(car1.getYear());

    Car car2 = new Car("Mazda", 2022);
    Car car3 = new Car(car2);
    System.out.println(car3.getModel());
    car2.copy(car1);
    System.out.println(car2.getModel());


    Bicycle bicycle1 = new Bicycle();
    car1.go();
    bicycle1.stop();




    }
}

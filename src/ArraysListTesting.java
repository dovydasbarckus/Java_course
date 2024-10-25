
import java.util.ArrayList;

public class ArraysListTesting {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");

        cars.set(0, "Mustang");
//        cars.remove(2);
//        cars.clear();

        for (String car : cars) {
            System.out.println(car);
        }

        for (int i = 0; i <cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}




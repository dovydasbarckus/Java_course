package Testing_classes;

public class Car extends Vehicle{

    private String model;
    private int year;

    Car(String model, int year){
        this.setModel(model);
        this.setYear(year);
    }
    Car(Car car){
        this.setModel(car.getModel());
        this.setYear(car.getYear());
    }
    public String getModel(){
        return model;
    }
    public int getYear() {
        return year;
    }
    public void setModel(String model){
    this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void copy(Car car){
        this.model = car.model;
        this.year = car.year;

    }

}

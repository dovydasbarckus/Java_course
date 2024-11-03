

enum Laptop {
    Macbook(2000), Lenovo(1400), Surface, Asus(1500), Dell(1800);

    private int price;

    Laptop() {
        price = 0;
    }

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumTesting {

        public static void main(String[] args){

//            Laptop laptop = Laptop.Macbook;
//            System.out.println(laptop.getPrice());

            for(Laptop laptop : Laptop.values()) {
                System.out.println(laptop + " " + laptop.getPrice());
            }

    }
}

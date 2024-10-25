

public class Printf {
    public static void main(String[] args) {

        String myName = "David";
        int score = 50;
        boolean badWeather = true;
        double number = 1000.02;

        System.out.printf("Testing %s\n", myName);
        System.out.printf("Testing %d\n", score);
        System.out.printf("Testing %b\n", badWeather);
        System.out.printf("Testing %f\n", number);

        System.out.printf("Testing %30f\n", number);
        System.out.printf("Testing %.2f\n", number);
        System.out.printf("Testing %020f\n", number);
        System.out.printf("Testing %,f\n", number);
    }
}

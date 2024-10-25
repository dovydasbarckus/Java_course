import java.util.Random;
import javax.swing.JOptionPane;

public class Gui_and_random {
    public static void main(String[] args) {

        int number = 5;
        Integer number2 = 10; // wrapper, changed from primitive type to reference type

        System.out.println("number = " + number);
        System.out.println(number);

        System.out.println(number2.intValue());

        Random random = new Random();
        int x = random.nextInt(6) + 1;
        System.out.println(x);
        double y = random.nextDouble();
        System.out.println(y);
        boolean z = random.nextBoolean();
        System.out.println(z);

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt( JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null,"You are age " + age + " years old");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height?"));
        JOptionPane.showMessageDialog(null, "Your height is " + height + " cm tall");

    }
}

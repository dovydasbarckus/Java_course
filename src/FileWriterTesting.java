import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTesting {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red");
            writer.append("\nViolets are blue");
            writer.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileReader fileReader = new FileReader("poem.txt");
            int data = fileReader.read();
            while (data !=-1){
                System.out.print((char) data);
                data = fileReader.read();
            }
            fileReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

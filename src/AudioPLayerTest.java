import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AudioPLayerTest {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

    File file = new File("BluesyVibes.mp3");
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);

    Scanner scanner = new Scanner(System.in);

    String response = "";

    while(!response.equals("Q")){
        System.out.println("P for Play, S for Stop, R for Reset, Q for Quit");
        System.out.println("Enter your choice: ");

        response = scanner.next();
        response = response.toUpperCase();

        switch (response){
            case("P"): clip.start();
            break;
            case("S"): clip.stop();
            break;
            case("R"): clip.setMicrosecondPosition(0);
            break;
            case("Q"): clip.close();
            break;
            default: System.out.println("Not a valid response");

        }
    }
    System.out.println("Bye");
    }
}

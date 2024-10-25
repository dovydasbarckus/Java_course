package Serializer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args){

        User user = new User();

        user.name = "Tedd";
        user.password = "I<3pizza";

        try {
            FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(user);
            objectOut.close();
            fileOut.close();
            System.out.println("Object info saved");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}

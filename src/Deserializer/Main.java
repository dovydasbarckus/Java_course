package Deserializer;

import java.io.*;
import java.io.Serializable;

public class Main {

    public static void main(String[] args){

        User user;

        try{
            FileInputStream fileIn = new FileInputStream("C:\\Users\\dbarc\\OneDrive\\Desktop\\praktika-teorija\\java\\Java_course\\UserInfo.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            user = (User) objectIn.readObject();
            objectIn.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(user.name);
        System.out.println(user.password);

    }
}


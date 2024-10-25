import java.io.*;

// Class to be serialized
record Person(String name, int age) implements Serializable {
    // serialVersionUID ensures compatibility during serialization
    private static final long serialVersionUID = 1L;

    // Constructor

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        // Create an object of the Person class
        Person person = new Person("John", 30);

        // Serialize the object to a file
        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(person);
            System.out.println("Serialization: Object has been serialized to person.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object from the file
        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Deserialization: Object has been deserialized");
            System.out.println("Name: " + deserializedPerson.name());
            System.out.println("Age: " + deserializedPerson.age());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(ObjectStreamClass.lookup(person.getClass()).getSerialVersionUID());
    }
}

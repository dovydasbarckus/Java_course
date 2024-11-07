import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Student implements Comparable<Student>{

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    //implementing comparator in class itself
    @Override
    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class CollectionDemo {
    public static void main(String[] a){

    Comparator<Student>compareStudent = new Comparator<>(){

        @Override
        public int compare(Student o1, Student o2) {
            if(o1.age > o2.age)
                return 1;
            else
                return -1;
        }
    };

    List<Student> studentsList = new ArrayList<Student>();
    studentsList.add(new Student(38, "Tom"));
    studentsList.add(new Student(33, "Julia"));
    studentsList.add(new Student(27, "Ken"));

    //studentsList.sort(compareStudent); // your separate comperator
    Collections.sort(studentsList); // implementing comparator in class itself
    for(Student student : studentsList){
        System.out.println(student);
    }

    Collection<Integer> nums1 = new ArrayList<>();
    nums1.add(6);
    nums1.add(2);
    nums1.add(3);
    System.out.println(nums1);

    //more methods with lists
    List<Integer> nums2 = new ArrayList<>();
    nums2.add(6);
    nums2.add(2);
    nums2.add(3);
    nums2.add(6);
    System.out.println(nums2.get(1));
    System.out.println(nums2.indexOf(2));

    //sorting list
    Collections.sort(nums2);
    System.out.println(nums2);

    // set have only unique values
    Set<Integer> nums3 = new HashSet<>();
    nums3.add(6);
    nums3.add(9);
    nums3.add(7);
    nums3.add(7);
    nums3.add(2);
    nums3.add(3);
    nums3.add(6);
    nums3.add(8);
    System.out.println(nums3);

    Set<Integer> nums4 = new TreeSet<>();
    nums4.add(6);
    nums4.add(9);
    nums4.add(7);
    nums4.add(7);
    nums4.add(2);
    nums4.add(3);
    nums4.add(6);
    System.out.println(nums4);

    Iterator<Integer>values = nums4.iterator();
    while(values.hasNext()) System.out.println(values.next());

    Map<String, Integer> students = new HashMap<>();
    students.put("May",56);
    students.put("April",26);
    students.put("June",68);
    students.put("July",66);
    students.put("May",99);

    System.out.println(students);
    for(String key : students.keySet()){
        System.out.println(key + ":" + students.get(key));
    }

    // Hashtable - work with multithreads
    // Map<String, Integer> students = new Hashtable<>();


    // own logic sorting

    Comparator<Integer>compare = new Comparator<>(){

        @Override
        public int compare(Integer o1, Integer o2)
        {
            if(o1%10 > o2%10) return 1; else return -1;
        }
    };

    List<Integer> nums5 = new ArrayList<>();
    nums5.add(665);
    nums5.add(247);
    nums5.add(321);
    nums5.add(654);

    nums5.sort(compare);
    System.out.println(nums5);

    }
}

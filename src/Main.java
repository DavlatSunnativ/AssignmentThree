import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        ArrayList<Person> personArrayList=new ArrayList<>();
        Student student = new Student("Davlat", "Sunnatov",3.46);
        Employee employee = new Employee("Kanye", "West",5000.00,"Singer");
        Employee employee1 =  new Employee("Rocky", "Rocky", 100000.00, "Rocky");
        Student student1 = new Student("Elon", "Musk", 2.55);
        personArrayList.add(student);
        personArrayList.add(student1);
        personArrayList.add(employee);
        personArrayList.add(employee1);
        Collections.sort(personArrayList, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return Double.valueOf(person1.getPaymentAmount()).compareTo(person2.getPaymentAmount());
            }
        });
        System.out.println(personArrayList);

    }
}
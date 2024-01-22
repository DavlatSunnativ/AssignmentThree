
public abstract class Person implements Payable,Comparable<Person>  {
    private int id;
    private String name;
    private  String surname;
    private  static int id_gen=1;
    public Person(){
        id=id_gen++;
    }
    public Person(String name,String  surname){
        setName(name);
        setSurname(surname);
    }
    public int compareTo(Person person){
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
    @Override
    public abstract double getPaymentAmount();

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    public int getId() {
        return id;
    }
    public abstract String getPosition();

    public String toString() {
        return getPosition() + ": "+"\n"+
                "Id: " + getId() +"\n"+
                "Name: " + name  +"\n"+
                "Surname: " + surname +"\n";
    }
}
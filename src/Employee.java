
public class Employee extends Person {
    private String position;
    private double salary;
    public Employee(){
        super();
    }
    public Employee(String name,String surname,double salary, String position){
        super(name,surname);
        setSalary(salary);
        setPosition(position);
    }
    @Override
    public String getPosition() {
        return this.position;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }


    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +"Earns: "+getSalary()+ " tenge"+"\n";
    }
}
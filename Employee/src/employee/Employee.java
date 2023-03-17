package employee;

/**
 *
 * @author HieuSA
 */
public class Employee {

   private String name;
   private int age;
   private String gmail;
   private String position;
   private double salary;

    public Employee(String name, int age, String gmail, String position, double salary) {
       this.name = name;
       this.age = age;
       this.gmail = gmail;
       this.position = position;
       this.salary = salary;
   }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
   
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    public String getGmail() {
        return gmail;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public static void main(String[] args) {
        Employee e = new Employee("Hieu",22,"hieuSA@gmail.com","developer",2000);

        System.out.println(e.getName());
        System.out.println(e.getAge());
        System.out.println(e.getGmail());
        System.out.println(e.getPosition());
        System.out.println(e.getSalary());

    }
    
}

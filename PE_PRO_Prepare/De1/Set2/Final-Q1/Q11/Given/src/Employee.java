
public class Employee {
    private String name;
    private double salary;
     
    public Employee() {
        
    }
    
     public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
   //add and complete your other methods here (if needed)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return salary;
    }

    public void setBasicSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %.1f ", this.getName(),this.getBasicSalary());
    }

   
    
}

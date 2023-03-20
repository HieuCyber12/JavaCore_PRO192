

public class Seller extends Employee {  
    private double revenue;
   
    public Seller() {
       throw new UnsupportedOperationException("Remove this line and implement your code here!");
    }

    public Seller(String name, double revenue, double salary) {
        super(name,salary);
        this.revenue = revenue;
    }
    
     /*Complete the below function for second test case*/
    public double getSalary() {
        double bonus;
        if(revenue < 30000){
            bonus = revenue*0.0005;
            System.out.println(bonus);
        }
        else
            bonus = revenue*0.00001;
     
        
        
        if(this.getName().startsWith("C") ||this.getName().startsWith("c") ){
            double salary = this.getBasicSalary()+Math.ceil(bonus);
            return salary;
          
        }
        else {
           
            double salary = this.getBasicSalary()+ Math.floor(bonus);
            return salary;
        }
        
        
        
    }  
    
    public double getRevenue() {
        return revenue;
    }

    //add and complete your other methods here (if needed)
    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return String.format("%s %.1f %.1f", this.getName(),this.getSalary(),this.getRevenue());
    }
    
}

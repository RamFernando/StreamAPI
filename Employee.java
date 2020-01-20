import java.util.ArrayList;

public class Employee {
   String name;
   int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public static ArrayList<Employee> getAllEmployees(){
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Kamal", 25000));
        emp.add(new Employee("Ama", 45000));
        emp.add(new Employee("Saman", 49500));
        emp.add(new Employee("Nimal", 36500));
        
        return emp;
    }
   
    @Override
   public String toString(){
       return getName()+" "+getSalary();
   }
}

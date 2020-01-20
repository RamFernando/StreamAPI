import java.util.List;
import java.util.stream.Collectors;

//Results == Original

public class EmployeeNameChanger {
    public static void main(String[] args) {
        
        List<Employee> allEmployees = Employee.getAllEmployees();
        
        List<Employee> changedEmployees = allEmployees.stream()
                .filter(e->e.getName().contains("a"))
                .map(e->new Employee("Dr. "+e.getName(),e.getSalary()))
                .collect(Collectors.toList());
        
        System.out.println(allEmployees);
        System.out.println(changedEmployees);
    }
}

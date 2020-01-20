import java.util.List;
import java.util.stream.Collectors;

//Result <= Original

public class EmployeeFilter {
    public static void main(String[] args) {
        
        List<Employee> emplist = Employee.getAllEmployees();
        System.out.println(emplist);
        
        List<Employee> filteredemplist = Employee.getAllEmployees().stream() //Use .parallelStream() for larger collections
                .filter(e->e.getName().contains("i"))
                .collect(Collectors.toList());
        
        System.out.println(filteredemplist);
        
    }
}

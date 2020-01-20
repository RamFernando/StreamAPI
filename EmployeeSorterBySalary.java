import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorterBySalary {
    public static void main(String[] args) {
        
        List<Employee> allEmployees = Employee.getAllEmployees();
        
        List<Employee> sortedEmployees = allEmployees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        
        System.out.println(allEmployees);
        System.out.println(sortedEmployees);
        
    }
}

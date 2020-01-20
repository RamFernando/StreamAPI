import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorterByName {
    public static void main(String[] args) {
        List<Employee> allEmployees = Employee.getAllEmployees();
        
        List<Employee> sortedEmployeelist = allEmployees.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());
        
        System.out.println(allEmployees);
        System.out.println(sortedEmployeelist);
    }
}

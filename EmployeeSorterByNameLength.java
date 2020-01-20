import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorterByNameLength {
    public static void main(String[] args) {
        List<Employee> allEmployees = Employee.getAllEmployees();
        
        List<Employee> sortedEmployeeList = allEmployees.stream()
                .sorted((e1,e2)->new Integer(e1.getName().length()).compareTo(e2.getName().length()))
                .collect(Collectors.toList());
        
        System.out.println(allEmployees);
        System.out.println(sortedEmployeeList);
    }
}

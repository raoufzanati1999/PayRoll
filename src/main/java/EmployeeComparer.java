import java.util.Comparator;

public class EmployeeComparer  implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getLast_name().compareTo(employee2.getLast_name());
    }
}
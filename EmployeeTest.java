import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("vijay", 12, 12000, "filmnagar");
        Employee emp1 = new Employee("Ramu", 23, 15000, "Boarabonda");
        Employee emp2 = new Employee("Rakesh", 25, 20000, "Krishna nagar");
        List<Employee> emplist = new ArrayList<>();
        emplist.add(emp);
        emplist.add(emp1);
        emplist.add(emp2);
        List<Integer> ids=


                emplist.stream().filter(employee -> employee.getSal()>10000).sorted(Comparator.comparing(Employee::getAddress)).map(Employee::getId).collect(Collectors.toList());
        ids.forEach(System.out::println);


    }


}

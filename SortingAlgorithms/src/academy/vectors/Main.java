package academy.vectors;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Joel", "Duran", 01));
        employeeList.add(new Employee("John", "Doe", 02));
        employeeList.add(new Employee("Miguel", "Gomez", 03));

    }
}

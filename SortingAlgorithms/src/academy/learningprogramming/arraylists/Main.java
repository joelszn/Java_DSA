package academy.learningprogramming.arraylists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //      Using list is useful instead of declaring ArrList to begin with because it allows you to
        // reassign the list later
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Joel", "Duran", 01));
        employeeList.add(new Employee("John", "Doe", 02));
        employeeList.add(new Employee("Miguel", "Gomez", 03));

//        employeeList.forEach(employee -> System.out.println(employee));
//        System.out.println(employeeList.get(1));
//        System.out.println(employeeList.isEmpty());
        employeeList.set(1, new Employee("Abe", "Lincoln", 1865));
//        employeeList.forEach(employee -> System.out.println(employee));


//        System.out.println(employeeList.size());

//        adding at an index
        employeeList.add(3, new Employee("Julian", "Edelman", 90));
//        employeeList.forEach(employee -> System.out.println(employee));
//      this can be expensive because it shifts elements down
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}

package Home_Work_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Worker("Коновалов", "Александр", 50000));
        employees.add(new Freelancer("Мартынов", "Тимофей", 500));

        // Add more employees of different types

        // Sort the employees using your custom comparator
        Collections.sort(employees);

        // Print the sorted employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

public class Practise1 {

    public static void main(String[] args) {

        // 1. Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 75000, "HR"),
                new Employee(2, "Bob", 85000, "IT"),
                new Employee(3, "Charlie", 95000, "Finance"),
                new Employee(4, "David", 65000, "IT"),
                new Employee(5, "Eva", 105000, "HR")
        );

        System.out.println("🔥 Initial Employee List:");
        employees.forEach(System.out::println);

        // 2. Filter employees wrt salary > 80,000
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(emp -> emp.getSalary() > 80000)  // Lambda expression
                .collect(Collectors.toList());

        System.out.println("\n💰 Employees with Salary > 80,000:");
        highSalaryEmployees.forEach(System.out::println);

        // 3. Map -> Convert employee names to uppercase
        List<String> upperCaseNames = employees.stream()
                .map(emp -> emp.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println("\n🔠 Employee Names in Uppercase:");
        upperCaseNames.forEach(System.out::println);

        // 4. Sorting employees by salary (ascending)
        List<Employee> sortedBySalary = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println("\n📈 Employees Sorted by Salary (Ascending):");
        sortedBySalary.forEach(System.out::println);

        // 5. Terminal Operation: Summing salaries using reduce
        double totalSalary = employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println("\n💵 Total Salary of All Employees: " + totalSalary);

        // 6. Using built-in Functional Interfaces
        Predicate<Employee> salaryPredicate = emp -> emp.getSalary() > 90000;
        List<Employee> highEarningEmployees = employees.stream()
                .filter(salaryPredicate)
                .collect(Collectors.toList());

        System.out.println("\n✅ Employees with salary > 90,000 (Using Predicate):");
        highEarningEmployees.forEach(System.out::println);

        // 7. Custom Functional Interface
        SalaryIncrement increment = (sal) -> sal * 1.1;  // 10% increment
        List<Double> updatedSalaries = employees.stream()
                .map(emp -> increment.applyIncrement(emp.getSalary()))
                .collect(Collectors.toList());

        System.out.println("\n🚀 Updated Salaries after 10% Increment:");
        updatedSalaries.forEach(System.out::println);
    }

    // Custom Functional Interface
    @FunctionalInterface
    interface SalaryIncrement {
        double applyIncrement(double salary);
    }
}

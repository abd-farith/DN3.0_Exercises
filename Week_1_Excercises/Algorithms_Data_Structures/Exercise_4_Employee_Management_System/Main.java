// Step 1: Understanding the problem is completed in Understanding.txt
// Step 4: Analysis is completed in Analysis.txt

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);
        
        ems.addEmployee(new Employee(1, "Alice", "Developer", 70000));
        ems.addEmployee(new Employee(2, "Bob", "Manager", 90000));
        ems.addEmployee(new Employee(3, "Charlie", "Analyst", 60000));

       
        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearching for Employee with ID 2:");
        Employee emp = ems.searchEmployee(2);
        if (emp != null) {
            System.out.println(emp.getEmployeeId() + " " + emp.getName() + " " + emp.getPosition() + " " + emp.getSalary());
        } else {
            System.out.println("Employee not found.");
        }

       
        System.out.println("\nDeleting Employee with ID 1:");
        ems.deleteEmployee(1);

        System.out.println("\nAll Employees after deletion:");
        ems.traverseEmployees();
    }
}

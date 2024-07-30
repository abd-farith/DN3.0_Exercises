public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public boolean addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
            return true;
        }
        return false;
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].getEmployeeId() + " " + employees[i].getName() + " " + employees[i].getPosition() + " " + employees[i].getSalary());
        }
    }

    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                employees[i] = employees[--count];
                employees[count] = null;
                return true;
            }
        }
        return false;
    }

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
        ems.traverseEmployees();
    }
}

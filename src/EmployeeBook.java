import java.util.Objects;

public class EmployeeBook {
    private static Employee[] employees;
    private static int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String fullName, int department, double salary) {
        Employee employee1 = new Employee(fullName, department, salary);
        employees[size] = employee1;
        size++;
    }

    public void deleteEmployee(String fullName, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (fullName.equals(employees[i].getFullName()) && id == employees[i].getId()) {
                System.out.println("Сотрудник " + employees[i].getFullName() + ". id - " + id + " " + "удален");
                employees[i] = null;
                size = i;
                return;
            }
        }
    }


    public void editEmployee(String fullName, int department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (fullName.equals(employees[i].getFullName())) {
                employees[i].setSalary(salary);
                employees[i].setDepartment(department);
                return;
            }
        }
    }


    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Васильев Василий Васильевич", 4, 65_000);
        employeeBook.addEmployee("Георгиев Георгий Георгиевич", 3, 70_000);
        employeeBook.addEmployee("Филиппов Филипп Филиппович", 1, 60_000);
        employeeBook.addEmployee("Кириллов Кирилл Кириллович", 2, 80_000);
        employeeBook.addEmployee("Константинов Константин Константинович", 5, 75_000);




    }


}






public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private int id;
    private static int counter;


    public Employee(String fullName, int department, double salary) {
        if (department > 5 || department <= 0) {
            throw new IllegalArgumentException("Такого отдела нет");
        }
        id = counter;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }
    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО - " + fullName + ". Отдел - " + department + ". Зарплата - " + salary + ". id - " + id;
    }

}

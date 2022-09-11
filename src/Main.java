public class Main {
    private static Employee[] employees = new Employee[]{};

    public static Employee[] putEmployees() {
        employees = new Employee[10];
        return employees;
    }


    public static Employee putEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            } else {
            }
        }
        return employee;
    }

    public static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static double calculateSumSalary() {
        double average = 0;
        for (int i = 0; i < employees.length; i++) {
            average = average + employees[i].getSalary();
        }
        return average;
    }

    public static double calculateMinimalEmployeeSalary() {
        double minEmployeeSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minEmployeeSalary > employees[i].getSalary()) {
                    minEmployeeSalary = employees[i].getSalary();
                }
            }
        }
            return minEmployeeSalary;
        }

        public static double calculateMaximalEmployeeSalary () {
            double maxEmployeeSalary = employees[0].getSalary();
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    if (maxEmployeeSalary < employees[i].getSalary()) {
                        maxEmployeeSalary = employees[i].getSalary();
                    }
                }
            }
            return maxEmployeeSalary;

        }

        public static double calculateAverageSalary () {
            double sumSalary = calculateSumSalary();
            double averageSalary = sumSalary / employees.length;
            return averageSalary;

        }

        public static void printAverageSalary () {
            System.out.println("Средняя зарплата сотрудников - " + calculateAverageSalary());
        }

        public static void printMaximalEmployeeSalary () {
            System.out.println("Максимальная зарплата среди сотрудников - " + calculateMaximalEmployeeSalary());
        }

        public static void printMinimalEmployeeSalary () {
            System.out.println("Минимальная зарплата среди сотрудников - " + calculateMinimalEmployeeSalary());
        }

        public static void printSumSalary () {
            System.out.println("Сумма затрат на зарплаты - " + calculateSumSalary());
        }

        public static void printFullNameOfEmployees () {
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i].getFullName());
            }
        }


        public static void doIndex ( double index){
            for (int i = 0; i < employees.length; i++) {
                employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() * index / 100));
            }
        }

        public static void printAllEmployeesInDepartment ( int department){
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department) {
                    System.out.println("ФИО - " + employees[i].getFullName() + ". Зарплата - " + employees[i].getSalary() + ". id - " + employees[i].getId());
                }
            }
        }

        public static double calculateMinimalSalaryInDepartment ( int department){
            double minimalSalary = calculateMaximalEmployeeSalary();
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department) {
                    if (minimalSalary > employees[i].getSalary()) {
                        minimalSalary = employees[i].getSalary();
                    }


                } else {
                }

            }
            return minimalSalary;
        }


        public static double calculateMaximalSalaryInDepartment ( int department){
            double maximalSalary = calculateMinimalEmployeeSalary();
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getDepartment() == department) {
                    if (maximalSalary < employees[i].getSalary()) {
                            maximalSalary = employees[i].getSalary();
                        }
                    }
                }
            return maximalSalary;
        }
        // Проверка на налл


        public static double calculateSumSalaryInDepartment ( int department){
            double sumSalary = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department) {
                    sumSalary = sumSalary + employees[i].getSalary();
                }
            }
            return sumSalary;
        }


        public static double calculateAverageSalaryInDepartment ( int department){
            int numberOfEmployeesInDepartment = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department) {
                    numberOfEmployeesInDepartment++;
                }
            }
            double averageSalaryInDepartment = calculateSumSalaryInDepartment(department) / numberOfEmployeesInDepartment;
            return averageSalaryInDepartment;
        }


        public static void doIndexInDepartment ( int department, double index){
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department) {
                    employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() * index / 100));

                }

            }
        }

        public static void showSalaryOfEmployeesMoreThanGivenCount ( double count){
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getSalary() >= count) {
                    System.out.println("Больше " + count + " зарабатывают: " + "id - " + employees[i].getId() + ". ФИО - " + employees[i].getFullName() + ". Зарплата " + employees[i].getSalary());
                }
            }
        }

        public static void showSalaryOfEmployeesLessThanGivenCount ( double count){
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getSalary() < count) {
                    System.out.println("Меньше " + count + " зарабатывают: " + "id - " + employees[i].getId() + ". ФИО - " + employees[i].getFullName() + ". Зарплата " + employees[i].getSalary());

                }
            }
        }


        public static void main (String[]args){
            putEmployees();
            Employee employee = putEmployee(new Employee("Иванов Иван Иванович", 1, 65_000));
            Employee employee1 = putEmployee(new Employee("Семенов Семен Семенович", 5, 65_000));
            Employee employee2 = putEmployee(new Employee("Борисов Борис Борисович", 3, 65_000));
            Employee employee3 = putEmployee(new Employee("Алексеев Алексей Алексеевич", 4, 80_000));
            Employee employee4 = putEmployee(new Employee("Дмитриев Дмитрий Дмитриевич", 5, 90_000));
            Employee employee5 = putEmployee(new Employee("Сергеев Сергей Сергеевич", 3, 60_000));
            Employee employee6 = putEmployee(new Employee("Павлов Павел Павлович", 1, 55_000));
            Employee employee7 = putEmployee(new Employee("Игнатов Игнат Игнатович", 2, 150_000));
            Employee employee8 = putEmployee(new Employee("Марков Марк Маркович", 3, 100_000));
//        Employee employee9 = putEmployee(new Employee("Егоров Егор Егорович", 4, 85_000));

//         Базовая сложность
//        printEmployees(); //a
//        printSumSalary();//b
        printMaximalEmployeeSalary();//c
//        printMinimalEmployeeSalary(); //d
//        printAverageSalary(); //e
//        printFullNameOfEmployees(); //f


//         Повышенная сложность
//        doIndex(10); // 1
//        System.out.println(calculateMinimalSalaryInDepartment(1)); //2. a

//
        System.out.println(calculateMaximalSalaryInDepartment(5));//2.b
//        System.out.println(calculateSumSalaryInDepartment(5));//2.c
//        System.out.println(calculateAverageSalaryInDepartment(5));//2.d
//        doIndexInDepartment(2, 10);//2.e
//        printAllEmployeesInDepartment(1);//2.f
//        showSalaryOfEmployeesMoreThanGivenCount(100000);// 3
//        showSalaryOfEmployeesLessThanGivenCount(100000);// 3


        }


    }

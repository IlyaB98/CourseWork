import java.util.Arrays;
import java.util.Scanner;

public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }

    public void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            System.out.println(employees[i]);

        }
    }

    public void printSumSalaryAndAverage() {
        double sumSalary = 0.0;
        int amountEmployees = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                sumSalary += 0;
                amountEmployees += 0;
            } else {
                sumSalary += employees[i].getSalary();
                amountEmployees++;
            }
        }
        double averageSalary = sumSalary / amountEmployees;

        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary
                + ", среднее значение зарплат: " + averageSalary);
    }

    public void printMinSalary() {
        double minSalary = Double.MAX_VALUE;
        String name = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                minSalary = minSalary;
            } else if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
                name = employees[i].getLastName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName();
            }
        }
        System.out.printf("Минимальная зарплата у сотрудника %s составляет %f рублей.\n", name, minSalary);
    }

    public void printMaxSalary() {
        double maxSalary = Integer.MIN_VALUE;
        String name = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                maxSalary = maxSalary;
            } else if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
                name = employees[i].getLastName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName();
            }
        }
        System.out.printf("Максимальная зарплата у сотрудника %s составляет %f рублей.\n", name, maxSalary);
    }

    public void printFullNameEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println((i + 1) + ": " + employees[i].getLastName() + " " + employees[i].getFirstName() + " "
                        + employees[i].getMiddleName());
            }
        }
    }

    public void indexSalary(int indexOfChange) {
        double index = indexOfChange / 100.0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary((employees[i].getSalary() + (employees[i].getSalary() * index)));
            }
        }
    }

    public void printMinSalaryByDepartment(int departmentNumber) {
        double minSalary = Double.MAX_VALUE;
        String name = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                minSalary = minSalary;
            } else if (minSalary > employees[i].getSalary() && departmentNumber == employees[i].getDepartment()) {
                minSalary = employees[i].getSalary();
                name = employees[i].getLastName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName();
            }
        }
        System.out.printf("Минимальная зарплата у сотрудника %d отдела %s составляет %f рублей.\n", departmentNumber, name, minSalary);
    }

    public void printMaxSalaryByDepartment(int departmentNumber) {
        double maxSalary = Integer.MIN_VALUE;
        String name = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                maxSalary = maxSalary;
            } else if (maxSalary < employees[i].getSalary() && departmentNumber == employees[i].getDepartment()) {
                maxSalary = employees[i].getSalary();
                name = employees[i].getLastName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName();
            }
        }
        System.out.printf("Максимальная зарплата у сотрудника %d отдела %s составляет %f рублей.\n", departmentNumber, name, maxSalary);
    }

    public void printSumSalaryAndAverageByDepartment(int departmentNumber) {
        double sumSalary = 0.0;
        int amountEmployees = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                sumSalary += 0;
                amountEmployees += 0;
            } else if (departmentNumber == employees[i].getDepartment()) {
                sumSalary += employees[i].getSalary();
                amountEmployees++;
            }
        }
        double averageSalary = sumSalary / amountEmployees;

        System.out.printf("Сумма затрат на зарплаты в %d отделе в месяц: %f, среднее значение зарплат: %f", departmentNumber,
                sumSalary, averageSalary);
    }

    public void indexSalaryOfDepartment(int departmentNumber, int indexOfChange) {
        double index = indexOfChange / 100.0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && departmentNumber == employees[i].getDepartment()) {
                employees[i].setSalary((employees[i].getSalary() + (employees[i].getSalary() * index)));
            }
        }
    }

    public void printFullNameEmployeesByDepartment(int departmentNumber) {
        System.out.println("Сотрудники " + departmentNumber + "-го отдела:");
        int sequenceNumber = 1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && departmentNumber == employees[i].getDepartment()) {
                System.out.println(sequenceNumber + ": " + employees[i].getLastName() + " "
                        + employees[i].getFirstName() + " " + employees[i].getMiddleName());
                sequenceNumber++;
            }
        }
    }

    public void printEmployeesByDepartment(int departmentNumber) {
        System.out.println("Сотрудники " + departmentNumber + "-го отдела:");
        int sequenceNumber = 1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && departmentNumber == employees[i].getDepartment()) {
                String employee = employees[i].getLastName() + " " + employees[i].getFirstName() + " "
                        + employees[i].getMiddleName() + ", зарплата " + employees[i].getSalary() + ", id " + employees[i].getId();
                System.out.println(sequenceNumber + ": " + employee);
                sequenceNumber++;
            }
        }
    }

    public void salaryLessThanTheSet(int setSalary) {
        System.out.println("Сотрудники с зарплатой меньше " + setSalary + " рублей:\n");
        int sequenceNumber = 1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && setSalary >= employees[i].getSalary()) {
                System.out.println(sequenceNumber + ": id " + employees[i].getId() + ", " + employees[i].getLastName() + " "
                        + employees[i].getFirstName() + " " + employees[i].getMiddleName() + ", зарплата "
                        + employees[i].getSalary());
                sequenceNumber++;
            }
        }
    }

    public void salaryAboveThanTheSet(int setSalary) {
        System.out.println("Сотрудники с зарплатой больше (или равной) " + setSalary + " рублей:\n");
        int sequenceNumber = 1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && setSalary <= employees[i].getSalary()) {
                System.out.println(sequenceNumber + ": id " + employees[i].getId() + ", " + employees[i].getLastName() + " "
                        + employees[i].getFirstName() + " " + employees[i].getMiddleName() + ", зарплата "
                        + employees[i].getSalary());
                sequenceNumber++;
            }
        }
    }

    public void addEmployee(String firstName, String middleName, String lastName, int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee newEmployee = new Employee(firstName, middleName, lastName, department, salary);
                employees[i] = newEmployee;
                break;
            }
        }
    }

    public void deleteEmployee(String firstName, String middleName, String lastName) {
        String fullName = lastName + " " + firstName + " " + middleName;
        for (int i = 0; i < employees.length; i++) {
            String fullNameEmployee = employees[i].getLastName() + " " + employees[i].getFirstName() + " "
                    + employees[i].getMiddleName();
            if (fullName.equals(fullNameEmployee)) {
                employees[i] = null;
                break;
            }
        }
    }

    public void editEmployee(String firstName, String middleName, String lastName) {
        String fullName = lastName + " " + firstName + " " + middleName;

        Scanner scanner = new Scanner(System.in);

        label:
        while (true) {
            System.out.println("Что вы хотите изменить для " + fullName
                    + "? Выберите действие. \n1. Изменить зарплату.\n2. Изменить отдел.");
            int operation = scanner.nextInt();
            if (operation < 1 || operation > 2) {
                throw new IllegalArgumentException("Такая операция не поддерживается!");
            }

            label2:
            for (int i = 0; i < employees.length; i++) {
                String fullNameEmployee = employees[i].getLastName() + " " + employees[i].getFirstName() + " "
                        + employees[i].getMiddleName();

                if (operation == 1 && fullName.equals(fullNameEmployee)) {
                    System.out.println("Введите новую зарплату для " + fullName);
                    int newSalary = scanner.nextInt();
                    if (newSalary < 0) {
                        throw new IllegalArgumentException("Зарплата не может быть отрицательной!");
                    }
                    employees[i].setSalary(newSalary);

                    System.out.println("Желаете продолжить?\n1. Да.\n2. Нет.");

                    int answer = scanner.nextInt();
                    if (answer < 1 || answer > 2) {
                        throw new IllegalArgumentException("Такая операция не поддерживается!");
                    }
                    switch (answer) {
                        case 1:
                            break label2;
                        default:
                            break label;
                    }
                }
                if (operation == 2 && fullName.equals(fullNameEmployee)) {
                    System.out.println("Введите новый отдел для " + fullName);
                    int newDepartment = scanner.nextInt();
                    if (newDepartment < 1 || newDepartment > 5) {
                        throw new IllegalArgumentException("Данного отдела не существует!");
                    }
                    employees[i].setDepartment(newDepartment);

                    System.out.println("Желаете продолжить?\n1. Да.\n2. Нет.");

                    int answer = scanner.nextInt();
                    if (answer < 1 || answer > 2) {
                        throw new IllegalArgumentException("Такая операция не поддерживается!");
                    }
                    switch (answer) {
                        case 1:
                            break label2;
                        default:
                            break label;
                    }
                }
            }
        }
    }

    public void listOfEmployeesByDepartment() {
        int quantityDepartment = 5;
        for (int department = 1; department <= quantityDepartment; department++) {
            printFullNameEmployeesByDepartment(department);
            System.out.println();
        }

    }
}

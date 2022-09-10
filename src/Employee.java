public class Employee {

    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private double salary;
    private static int id;

    public Employee(String firstName, String middleName, String lastName, int department, double salary, int id) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    public static int idNumber() {
        id++;
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getId() {
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
        return "Employee: " + lastName + " " + firstName + " " + middleName + " / отдел " + department
                + " / зарплата " + salary + " / " + "id " + idNumber();
    }
}

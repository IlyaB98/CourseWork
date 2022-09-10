public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        EmployeeBook employeeBook = new EmployeeBook(employees);

        employeeBook.addEmployee("Иван", "Иванович", "Иванов", 1, 33_453);
        employeeBook.addEmployee("Пётр", "Петрович", "Петров", 2, 25_762);
        employeeBook.addEmployee("Илья", "Владимирович", "Патрушин", 2, 34_856);
        employeeBook.addEmployee("Андрей", "Васильевич", "Гончаров", 4, 35_554);
        employeeBook.addEmployee("Владимир", "Николаевич", "Филатов", 3, 32_956);
        employeeBook.addEmployee("Николай", "Евгеньевич", "Угрюмов", 5, 26_957);
        employeeBook.addEmployee("Василий", "Васильевич", "Самойлов", 1, 28_865);
        employeeBook.addEmployee("Анастасия", "Валерьевна", "Красова", 5, 21_549);
        employeeBook.addEmployee("Екатерина", "Петровна", "Носова", 3, 56_649);

        employeeBook.deleteEmployee("Анастасия", "Валерьевна", "Красова");
        separator();
        employeeBook.listOfEmployeesByDepartment(employees);
        separator();
        employeeBook.editEmployee("Василий", "Васильевич", "Самойлов");

    }

    public static void separator() {
        System.out.println("---------------------------------------------------------------------------------");
    }

}
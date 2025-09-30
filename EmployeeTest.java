public class EmployeeTest {
    public static void main(String[] args) {
        // Проверка конструктора и toString()
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);

        // Проверка сеттеров и геттеров
        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());

        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary());

        // Проверка raiseSalary()
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}

class Employee {
    private int empId;
    private String first;
    private String last;
    private int monthlySalary;

    // конструктор
    public Employee(int id, String fName, String lName, int salary) {
        this.empId = id;
        this.first = fName;
        this.last = lName;
        this.monthlySalary = salary;
    }

    // геттеры
    public int getId() {
        return empId;
    }

    public String getFirstName() {
        return first;
    }

    public String getLastName() {
        return last;
    }

    public String getName() {
        return first + " " + last;
    }

    public int getSalary() {
        return monthlySalary;
    }

    public int getAnnualSalary() {
        return monthlySalary * 12;
    }

    // сеттер
    public void setSalary(int newSalary) {
        this.monthlySalary = newSalary;
    }

    // повышение зарплаты
    public int raiseSalary(int percent) {
        monthlySalary += monthlySalary * percent / 100;
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + empId +
                ",name=" + first + " " + last +
                ",salary=" + monthlySalary + "]";
    }
}

public class Employee {

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

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID : " + id +
                "\nName : " + name +
                "\nSalary : " + salary +
                "\nDepartment : " + department;
    }
}
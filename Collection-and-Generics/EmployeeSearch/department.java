import java.util.*;
public class department {
    private String departmentName;
    private ArrayList<Employee> employees;
    
    public department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }
    
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
    
    public Employee searchEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
    }
}
     return null;
    }
}
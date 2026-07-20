import java.util.*;
public class Employeemain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        department frontend = new department("Frontend");
        department backend = new department("Backend");
        department deployment = new department("Deployment");

        while (true) {

            System.out.println("\n====== Employee Management ======");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                System.out.println("\nChoose Department");
                System.out.println("1. Frontend");
                System.out.println("2. Backend");
                System.out.println("3. Deployment");
                System.out.print("Enter Choice: ");

                int dept = sc.nextInt();

                if (dept == 1) {
                    frontend.addEmployee(new Employee(id, name, salary, "Frontend"));
                }
                else if (dept == 2) {
                    backend.addEmployee(new Employee(id, name, salary, "Backend"));
                }
                else if (dept == 3) {
                    deployment.addEmployee(new Employee(id, name, salary, "Deployment"));
                }
                else {
                    System.out.println("Invalid Department!");
                    continue;
                }

                System.out.println("Employee Added Successfully!");

            }

            else if (choice == 2) {

                System.out.print("Enter Employee ID: ");
                int searchId = sc.nextInt();

                Employee emp = frontend.searchEmployee(searchId);

                if (emp == null)
                    emp = backend.searchEmployee(searchId);

                if (emp == null)
                    emp = deployment.searchEmployee(searchId);

                if (emp != null) {
                    System.out.println("\nEmployee Found");
                    System.out.println(emp);
                } else {
                    System.out.println("Employee Not Found!");
                }

            }

            else if (choice == 3) {

                System.out.println("Thank You!");
                break;

            }

            else {

                System.out.println("Invalid Choice!");

            }

        }

        sc.close();
    }
}
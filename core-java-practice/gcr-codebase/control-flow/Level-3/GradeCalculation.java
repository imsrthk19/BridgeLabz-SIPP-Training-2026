import java.util.*;
public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics Marks: ");
        double Physics = sc.nextDouble();

        System.out.println("Enter Chemistry Marks: ");
        double Chemistry = sc.nextDouble();

        System.out.println("Enter Maths Marks: ");
        double Maths = sc.nextDouble();

        double percentage = (Physics+Chemistry+Maths)/3;
        System.out.println("Percentage = " + percentage);

        if(percentage >= 80) {
            System.out.println("Grade A");
            System.out.println("Above agency-normalized standards");
        }
        else if(percentage >= 70) {
            System.out.println("Grade B");
            System.out.println("At agency-normalized standards");
        }
        else if(percentage >= 60) {
            System.out.println("Grade C");
            System.out.println("Approaching standards");
        }
        else if(percentage >= 50) {
            System.out.println("Grade D");
            System.out.println("Below standards");
        }
        else if(percentage >= 40) {
            System.out.println("Grade E");
            System.out.println("Too below standards");
        }
        else {
            System.out.println("Grade R");
            System.out.println("Remedial Standards");
        }

        sc.close();
    }
}

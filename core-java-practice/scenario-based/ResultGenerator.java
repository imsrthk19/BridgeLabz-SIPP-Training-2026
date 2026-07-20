import java.util.Scanner;

public class ResultGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalMarks = 0;

        System.out.println("Enter Marks of 5 Subjects:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double average = totalMarks / 5.0;

        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Average: " + average);

        int grade = (int) average / 10;

        switch (grade) {
            case 1:
                System.out.println("Grade : A");
                break;

            case 2:
                System.out.println("Grade : B");
                break;

            case 3:
                System.out.println("Grade : C");
                break;

            case 4:
                System.out.println("Grade : D");
                break;

            default:
                System.out.println("Grade : F");
        }
    }
} 
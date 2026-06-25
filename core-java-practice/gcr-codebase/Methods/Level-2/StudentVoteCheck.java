import java.util.Scanner;

public class StudentVoteCheck{
    public static boolean canStudentVote(int age) {

        if (age < 0) {
            return false;
        }

        if (age >= 18) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter Age of Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

        }

        System.out.println(" ");
        System.out.println("Voting Eligibility");

        for (int i = 0; i < ages.length; i++) {

            if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " Can Vote");
            } else {
                System.out.println("Student " + (i + 1) + " Cannot Vote");
            }

        }

        sc.close();
    }
}

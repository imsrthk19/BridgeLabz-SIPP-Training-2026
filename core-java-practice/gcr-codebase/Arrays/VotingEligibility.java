import java.util.*;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        
        System.out.println("\nVoting Eligibility Report:");

        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.err.println("Invalid age entered: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student with age " + ages[i] + " cannot vote.");
            }
        }
    }
}
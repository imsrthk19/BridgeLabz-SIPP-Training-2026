import java.util.*;

public class ElectionBoothManager {

    int age;
    int vote;

    public boolean isEligible() {
        return age >= 18;
    }

    public void recordVote() {
        switch (vote) {
            case 1:
                System.out.println("Vote Recorded for Candidate 1");
                break;

            case 2:
                System.out.println("Vote Recorded for Candidate 2");
                break;

            case 3:
                System.out.println("Vote Recorded for Candidate 3");
                break;

            default:
                System.out.println("Invalid Vote!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            ElectionBoothManager voter = new ElectionBoothManager();

            System.out.print("Enter Age or Enter -1 to Exit: ");
            voter.age = sc.nextInt();

            if (voter.age == -1) {
                System.out.println("Polling Booth Closed.");
                break;
            }

            if (voter.isEligible()) {

                System.out.println("Eligible to Vote");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");

                System.out.print("Enter Your Vote: ");
                voter.vote = sc.nextInt();

                voter.recordVote();

            } else {
                System.out.println("Not Eligible to Vote");
            }

            System.out.println();
        }
    }
}
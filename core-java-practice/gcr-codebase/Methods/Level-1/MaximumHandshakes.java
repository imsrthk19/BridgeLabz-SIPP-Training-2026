import java.util.*;
public class MaximumHandshakes{
    public static int calculateHandshakes(int n){
        return (n*(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students: ");
        int students = sc.nextInt();

        System.out.println("Maximum Handshakes: = "+ calculateHandshakes(students));
    }
}
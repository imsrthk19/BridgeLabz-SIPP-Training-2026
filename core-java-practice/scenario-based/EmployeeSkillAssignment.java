import java.util.ArrayList;
import java.util.*;

public class EmployeeSkillAssignment {

    public static void findTeams(int[] arr, int target,int index, ArrayList<Integer> team, int sum) {

        if (sum == target) {
            System.out.println(team);
            return;
        }

        if (index == arr.length) {
            return;
        }


        team.add(arr[index]);
        findTeams(arr, target, index + 1, team, sum + arr[index]);

        team.remove(team.size() - 1);
        findTeams(arr, target, index + 1, team, sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element "+ i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target: ");
        int target= sc.nextInt();
        findTeams(arr, target, 0, new ArrayList<>(), 0);
    }
}
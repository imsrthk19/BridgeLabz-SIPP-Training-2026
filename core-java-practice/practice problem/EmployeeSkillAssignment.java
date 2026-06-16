import java.util.*;

public class EmployeeSkillAssignment {

    public static void findTeams(int[] skills, int target,int index, ArrayList<Integer> team) {

        if (target == 0) {
            System.out.println(team);
            return;
        }

        if (index == skills.length || target < 0) {
            return;
        }

        team.add(skills[index]);
        findTeams(skills, target - skills[index], index + 1, team);

        team.remove(team.size() - 1);

        findTeams(skills, target, index + 1, team);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills, target, 0, new ArrayList<>());
    }
} 
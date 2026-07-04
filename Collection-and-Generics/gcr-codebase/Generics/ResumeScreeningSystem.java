import java.util.*;

abstract class JobRole {
    String name;
    JobRole(String name) {
        this.name = name;
    }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() { super("Software Engineer"); }
}

class Resume<T extends JobRole> {
    T role;

    Resume(T role) {
        this.role = role;
    }

    void display() {
        System.out.println("Role: " + role.name);
    }
}

public class ResumeScreeningSystem {

    public static void process(List<? extends JobRole> list) {
        for (JobRole j : list) {
            System.out.println(j.name);
        }
    }

    public static void main(String[] args) {

        List<JobRole> list = new ArrayList<>();
        list.add(new SoftwareEngineer());

        Resume<JobRole> r = new Resume<>(new SoftwareEngineer());
        r.display();

        process(list);
    }
}
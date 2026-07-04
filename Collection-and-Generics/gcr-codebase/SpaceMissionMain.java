public class SpaceMissionMain {
    public static void main(String[] args) {

        SpaceMissionData s = new SpaceMissionData();

        s.addMission("Mars");

        s.assign("Mars", new Astronaut(1, "Aman"));
        s.assign("Mars", new Astronaut(2, "Ravi"));

        s.display();
    }
}
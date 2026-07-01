public class GradStudent extends Student {
    protected String thesis;

    public GradStudent(int id, String name, int studentId, double studentGpa, String thesis) {
        super(id, name, studentId, studentGpa);
        this.thesis = thesis;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GradStudent{" +
                "thesis='" + thesis + '\'' +
                '}';
    }
}

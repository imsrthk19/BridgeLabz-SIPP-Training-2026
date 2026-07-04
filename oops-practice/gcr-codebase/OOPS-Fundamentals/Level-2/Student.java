public class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 75) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 40) return "C";
        else return "F";
    }

    public void display() {
        System.out.println("Name: "+ name +"\n" + "Roll No: "+ rollNumber + "\n"+ "Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s = new Student("Sarthak", 1, 85);
        s.display();
    }
}
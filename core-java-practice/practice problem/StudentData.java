import java.io.*;
import java.util.*;

public class StudentData {
   
    String ID;
    String Name;
    int Marks;

    public StudentData() {
    }

    public StudentData(String ID, String Name, int Marks) {
        this.ID = ID;
        this.Name = Name;
        this.Marks = Marks;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Marks=" + Marks +
                '}';
    }

    public void addStudentData() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your ID: ");
            ID = sc.next();

            System.out.print("Enter your Name: ");
            Name = sc.next();

            System.out.print("Enter your Marks: ");
            Marks = sc.nextInt();

            FileWriter writer = new FileWriter("Student.txt");

            writer.write(
                    "ID: " + ID +
                    ", Name: " + Name +
                    ", Marks: " + Marks +
                    "\n"
            );

            System.out.println();

            writer.close();

            System.out.println("Student Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchByName(){
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        BufferedReader reader =new BufferedReader(new FileReader("Student.txt")); //Buffer Reader uses the object of FileReader so we used FileReader inside BufferReader.
        String line;
        while((line=reader.readLine())!=null){
            String [] student = line.split(",");

            if(student[1].equalsIgnoreCase("Name:"+name)){
                System.out.println(student[0]);
                System.out.println(student[1]);
                System.out.println(student[2]);
            }
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
    public static void main(String[] args) {

        StudentData data = new StudentData();

        data.addStudentData(); 
        data.searchByName();  
    }
}
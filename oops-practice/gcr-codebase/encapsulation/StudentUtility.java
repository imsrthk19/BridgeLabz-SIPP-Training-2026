public class StudentUtility {
    public static void main(String[] args) {

        Student s = new Student();
        
        int a = s.getID();
        
        System.out.println(a);

        s.setName("Sarthak");

        String Name = s.getName();

        System.out.println(Name);  
    }
}

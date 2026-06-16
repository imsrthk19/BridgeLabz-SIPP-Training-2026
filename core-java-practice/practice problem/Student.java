// public class Student {
//     int id;
//     String name;
//     int Age;
//     String UniversityName;

//     public static void main(String[] args){
//         Student studentOne = new Student();
//         studentOne.id = 2315000;
//         studentOne.name = "Arpit";
//         studentOne.Age =21;
//         studentOne.UniversityName= "GLA UNIVERSITY";
//     }
// }


public class Student {
    int id;
    String name;
    int Age;
    String UniversityName;

    public String toString(){
     return Student{
        "+id: " + id + "name: " + name + "Age: " + Age+ "University Name: " + UniversityName
    };
    public static void main(String[] args){
        UniversityName= "GL UNIVESITY";
        Student studentOne = new Student();
        studentOne.id = 2315000;
        studentOne.name = "Arpit";
        studentOne.Age =21;

        System.out.println(studentOne);
        System.out.println(studentTwo);

        Student studentTwo = new Student();
        studentOne.id = 23150001;
        studentOne.name = "Ashish";
        studentOne.Age =21;
        studentOne.UniversityName= "GL UNIVERSITY";
}
}
}
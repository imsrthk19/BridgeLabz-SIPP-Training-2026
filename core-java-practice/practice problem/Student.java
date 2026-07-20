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
    int age;
    String universityName;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", universityName='" + universityName + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Student studentOne = new Student();
        studentOne.id = 2315000;
        studentOne.name = "Arpit";
        studentOne.age = 21;
        studentOne.universityName = "GL UNIVERSITY";

        Student studentTwo = new Student();
        studentTwo.id = 2315001;
        studentTwo.name = "Ashish";
        studentTwo.age = 21;
        studentTwo.universityName = "GLA UNIVERSITY";

        System.out.println(studentOne);
        System.out.println(studentTwo);
    }
}
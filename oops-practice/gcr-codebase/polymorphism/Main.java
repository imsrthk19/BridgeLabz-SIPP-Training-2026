//upcasting parent pe scope chala jayega.
//Method Overloading= method having same name in parent and child classes but difference in their parameters.4
// This is also called Compile-Time Polymorphism.
class Parent {
    public void add(){
        System.out.println("Hi I am Parent.");
    }

    public void add(int a){

    }
}

class Child extends Parent{
    // Overriding= method having same signature but differnece in the bracket part.
    //This is called Runtime Polymorphism.
    @Override
    public void add(){
        System.out.println("Hi! I am Child.");
    }
}

public class Main{
    public static void main(String[] args) {
        // Parent p = new Parent();
        Child c = new Child();
        c.add();
    }
}

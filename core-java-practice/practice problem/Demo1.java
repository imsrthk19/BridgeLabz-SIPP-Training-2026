public class Demo1{
    
public static void main(String[] args) {
    
    Demo1 d = new Demo1();
    
    System.out.println("Hii main method");
}

{
    System.out.println("Hi, non-static block");
}

static{
    System.out.println("Hi static block");
}

public Demo1(){
    System.out.println("Hii I am a constructor");
}

}

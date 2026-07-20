public interface IDemo{
    final int a=10; //by default public static and final
    void add();
}

class DemoTwo implements IDemo{   //Implementated Class
    public void add(){
        System.out.println("add"); //Override
    }
    
    public static void main(String[] args) {
        IDemo d = new DemoTwo();
    }
}

//Whenever we define an interface and override , it is necessary to implement an interface. It is called coding-contract.
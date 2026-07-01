interface ICalculator{
    void add(int a, int b);
    void Subtraction(int a, int b);
    void Multiplication(int a, int b);
    void Division(int a, int b);
}

class Calculate implements ICalculator{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void Subtraction(int a, int b){
        System.out.println(a-b);
    }
    public void Multiplication(int a, int b){
        System.out.println(a*b);
    }
    public void Division(int a, int b){
        System.out.println(a/b);
    }
}
class Calculating {
    public static void main(String[] args) {
        Calculate c = new Calculate();
        c.add(2,6);
        c.Subtraction(3, 6);
        c.Multiplication(2, 8);
        c.Division(4, 2);
    }
}

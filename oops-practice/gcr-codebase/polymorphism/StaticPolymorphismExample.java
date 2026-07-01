class Calculator {
    public int add(int a, int b) {
    return a + b;
}
    public int add(int a, int b, int c) {
        return a + b + c;
}
    public double add(double a, double b) {
        return a + b;
}
}

public class StaticPolymorphismExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum of two integers: " + calculator.add(5, 10));
        System.out.println("Sum of three integers: " + calculator.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + calculator.add(5.5, 10.5));
    }
}
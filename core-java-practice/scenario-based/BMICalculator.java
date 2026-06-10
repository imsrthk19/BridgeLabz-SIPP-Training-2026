// 2.  Maya’s BMI Fitness Tracker
// Maya, a fitness coach, wants to record the BMI of her clients.
// ●              Ask for height and weight.
// ●              Use formula BMI = weight / (height * height)
// ●              Print category using if-else: Underweight, Normal, Overweight.
 
// Use clear variable names and comments to maintain code hygiene.
import java.util.*; 
public class BMICalculator {
    public double BMICalculator(double weight, double height){
        double BMI= weight/(height*height);
        return BMI;
    }

    public double Classification(double BMI){
        if(BMI<18.5) System.out.println("Underweight Category.");
        else if(BMI >=18.5 && BMI < 25.0) System.out.println("Normal Category.");
        else System.out.println("Overweight Category");
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double height =sc.nextFloat();
        System.out.println("Height = ");
        double weight= sc.nextInt();
        System.out.println("Weight = ");
        BMICalculator BMI = new BMICalculator();
        
    }
}

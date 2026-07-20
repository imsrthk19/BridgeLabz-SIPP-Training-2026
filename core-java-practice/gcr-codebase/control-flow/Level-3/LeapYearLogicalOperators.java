import java.util.*;
public class LeapYearLogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        
        if( Year>=1582 && ((Year%4==0) && (Year%100!=0) || (Year%400==0))){
            System.out.println(Year+ " is a Leap Year.");
        }
        else{
            System.out.println(Year + " is not a Leap Year.");
        }
    sc.close();
    }
}

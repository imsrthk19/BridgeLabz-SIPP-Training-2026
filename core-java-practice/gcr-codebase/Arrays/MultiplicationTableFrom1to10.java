import java.util.*;
public class MultiplicationTableFrom1to10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = s.nextInt();   
        
        int [] table = new int[10];
        for(int i=0; i<table.length; i++){
            table[i] = n* (i+1);
        }
        System.out.println("\nMultiplication Table:");
        for(int i=0; i<table.length; i++){
            System.out.println(n + "*"+ (i+1)+ "=" + table[i]);
        }
    }
}

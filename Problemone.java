import java.util.Scanner;

public class Problemone {
 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
	System.out.println ("Enter first numbers:");
        int num1 = input.nextInt();

	System.out.println ("Enter second numbers:");
        int num2 = input.nextInt();

        System.out.println ("Enter third numbers: ");
        int num3 = input.nextInt();
        
        
        
        if (num1 < num2 && num1 < num3) {
 
            if (num2 < num3) {
               System.out.println("The second largest is " + num2);
            } 

	        else {
                System.out.println("The second largest is " + num3);
            }
            } 

	        else if (num2 < num1 && num2 < num3) {
         
                if (num1 < num3) {
                System.out.println("The second largest is " + num1);
            } 

	        else {
                System.out.println("The second largest is " + num3);
            }
            } 

	        else if (num3 < num1 && num3 < num2) {
           
            if (num1 < num2) {
                System.out.println("The second largest is " + num1);
            } 

	        else {
                System.out.println("The second largest is " + num2);
            }
            }
        
    }
}
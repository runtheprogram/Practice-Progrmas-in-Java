import java.util.Scanner;

public class Wow{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
	
	System.out.println("Enter three numbers:");
        int num2 = scanner.nextInt();

	System.out.println("Enter three numbers:");
        int num3 = scanner.nextInt();
        
        
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
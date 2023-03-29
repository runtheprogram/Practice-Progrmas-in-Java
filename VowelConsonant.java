import java.util.Scanner;

	public class VowelConsonant {
		public static void main(String[] args){
		
			Scanner input = new Scanner(System.in);
			
			System.out.println("Input a letter");
				char letter = input.next().charAt(0);

			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || 		letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
				
				System.out.println(letter + " " + "is vowel");
			}
			
			else {
				System.out.println(letter + " " + "is consonant");
			}
			
		}
	
	}
package FirstPackage;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
//		1.Write Fibonnaci series between the user entered start and end values
		int n3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me the min number");
	      int num1 = scan.nextInt();
	    System.out.println("Give me the max number");
	      int num2 = scan.nextInt();
	      int n4 = num1 + 1;
	      for(int i = 0; i <= num2; i++) {
	    	  n3 = num1 + n4;
	       System.out.println(n3);
	       	  n4 = num1;
	       	  num1 = n3;
	      }
//	      2.Determine whether a user entered number is an Armstrong number
	      System.out.println("Give me a 3 digit number");
			int num = scan.nextInt();
			int temp;
			int total = 0;
			
			for(int number = num; number !=0; number /= 10) {
				temp = number % 10;
				total = total + temp*temp*temp;
			}
			
			if(total == num) {
				System.out.println(num + " is an Armstrong number");
			}
			else {
				System.out.println(num + " is not an Armstrong number");
			}
//			3.Write a program to see if a user entered string is a palindrome or not
			String reverse = scan.nextLine();
			System.out.println("Enter a word to check if it is a palindrome");  
			String original = scan.nextLine();
			 int length = original.length(); 
			 for ( int i = length - 1; i >= 0; i-- ) {  
		         reverse = reverse + original.charAt(i);
			 }
			 if(original.equalsIgnoreCase(reverse)) {
				 System.out.println("It is a palindrome");
			 }
			 else {
				 System.out.println("It is not a palindrome");
			 }
	}

}

package FirstPackage;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number");
	      int num1 = scan.nextInt();
	    System.out.println("Give me another number");
	      int num2 = scan.nextInt();
	    System.out.println("1.Add 2.Subtract. 3.Multiply. 4.Divide. 5.Exit");
	      int num3 = scan.nextInt();
	      int ans;
	      switch ( num3 ) {
			case 1:
				ans = num1 + num2;
				System.out.println(ans);
				break;
			case 2:
				ans = num1 - num2;
				System.out.println(ans);
				break;
			case 3:
				ans = num1 * num2;
				System.out.println(ans);
				break;
			case 4:
				ans = num1 / num2;
				System.out.println(ans);
				break;
			case 5:
				System.out.println("Good Bye");
				break;
			default:
				System.out.println("Invalid Entry, Try Again");
				break;
	      }
	}
}

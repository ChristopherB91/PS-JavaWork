package FirstPackage;

import java.util.Scanner;

public class Hw3 {
	static void Add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number");
	    int add1 = scan.nextInt();
	    System.out.println("Give me another number");
	    int add2 = scan.nextInt();
	    int adda;
	    adda = add1 + add2;
	    System.out.println(adda);
	    scan.close();
	}
	
	static void Subtract() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me the biggger number first");
	    int Sub1 = scan.nextInt();
	    System.out.println("Give me another number");
	    int Sub2 = scan.nextInt();
	    int Suba;
	    Suba = Sub1 - Sub2;
	    System.out.println(Suba);
	    scan.close();
	}
	
	static void Multiply() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number");
	    int Mul1 = scan.nextInt();
	    System.out.println("Give me another number");
	    int Mul2 = scan.nextInt();
	    int Mula;
	    Mula = Mul1 * Mul2;
	    System.out.println(Mula);
	    scan.close();
	}
	
	static void Divide() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me the bigger number");
	    int Div1 = scan.nextInt();
	    System.out.println("Give me another number");
	    int Div2 = scan.nextInt();
	    int Diva;
	    Diva = Div1 / Div2;
	    System.out.println(Diva);
	    scan.close();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("1.Add 2.Subtract. 3.Multiply. 4.Divide. 5.Exit");
	      int num3 = scan.nextInt();
	      switch ( num3 ) {
			case 1:
				Add();
				break;
			case 2:
				Subtract();
				break;
			case 3:
				Multiply();
				break;
			case 4:
				Divide();
				break;
			case 5:
				System.out.println("Good Bye");
				break;
			default:
				System.out.println("Invalid Entry, Try Again");
				break;
	      }
	   scan.close();
	}
}

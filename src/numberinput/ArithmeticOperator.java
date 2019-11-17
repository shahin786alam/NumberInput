package numberinput;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int num1, num2, result;
		
	    System.out.println("Enter First number:");
	    num1 =input.nextInt();
	
		System.out.println("Enter second number:");
		num2=input.nextInt();
		
		result= num1+num2;
		System.out.println("sum="+result);
		
		result= num1-num2;
		System.out.println("sub="+result);
		
		result= num1*num2;
		System.out.println("multiplicatiom="+result);
		
		result= num1/num2;
		System.out.println("div="+result);
		
		result= num1%num2;
		System.out.println("Remainder="+result);
		
	}
  }



import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		String s1 = getInput("Enter a value");
		String s2 = getInput("Enter a value");
		String s3 = getInput("Choose an operation (+,-,*,/)");
		
		double result = 0;
		
		try {
			switch(s3)
			{
			case "+":
				result = add(s1, s2);
				break;
			case "-":
			    result = sub(s1, s2);
				break;
			case "*":
				result = mul(s1, s2);
				break;
			case "/":
				result = div(s1, s2);
				break;
			default :
				System.out.println("Invalid input");
				return;
			}
			
			System.out.println("The result is: " + result);
			
		} catch (Exception e) {
			
			System.out.println("formatting exception " + e.getMessage());
		}
		
		}
		
	
	private static double add(String str1, String str2) {
		double d1= Double.parseDouble(str1);
		double d2= Double.parseDouble(str2);
		double res = d1+d2;
		
		return res;
	}
	
	private static double sub(String str1, String str2) {
		double d1= Double.parseDouble(str1);
		double d2= Double.parseDouble(str2);
		double res = d1-d2;
		
		return res;
	}
	private static double mul(String str1, String str2) {
		double d1= Double.parseDouble(str1);
		double d2= Double.parseDouble(str2);
		double res = d1*d2;
		
		return res;
	}
	private static double div(String str1, String str2) {
		double d1= Double.parseDouble(str1);
		double d2= Double.parseDouble(str2);
		double res = d1/d2;
		
		return res;
	}
	
	private static String getInput(String operator) {
		System.out.print(operator);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

}
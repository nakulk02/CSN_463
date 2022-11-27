import java.util.Scanner;

public class Q1 {
	
	public static double division(int num1, int num2) { 
		if(num1 == 0 || num2 == 0) { 
			throw new ArithmeticException("Exception: numbers should not be zero");
		}
		else {
		    double ans = (double) num1 / num2;  
		    System.out.println(ans);
		    return ans;
		}
	}
	
	public static int multiply(int num1, int num2) {
		
		if(num1 == 0 || num2 == 0) { 
			throw new ArithmeticException("Exception: numbers should not be zero");
		}
		else {
			int ans = num1 * num2; 
		    System.out.println(ans); 
		    return ans;
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		int num1 = scn.nextInt();    
		int num2 = scn.nextInt();
		
		try { 
			division(num1, num2);   			
			multiply(num1, num2);
		}
		catch(ArithmeticException e) { 
			System.out.println(e);
		}
	}

}

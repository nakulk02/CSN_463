import java.util.Scanner;

class Calculator {
    private int num1; 
    private int num2;

     public Calculator(int num1, int num2) { 
         this.num1 = num1;
         this.num2 = num2;
     }

 	public void addition() {  
 		int ans = num1 + num2; 
		System.out.println("Addition : " + ans);
	}
	
	public void subtraction() { 
		int ans = num1 - num2;
		System.out.println("Subtraction: " + ans);
	}
	
	public void division() {
		double ans = (double) num1 / num2; 
		System.out.println("Division : " +ans);
	}
	
	public void multiply() {
		int ans = num1 * num2; 
	    System.out.println("Multiplication : " + ans);
	}
 }

public class Q3 {
	 public static void main(String ar[]) {

		 Scanner scn = new Scanner(System.in);
		 int num1, num2;
		 try {
			 num1 = Integer.parseInt(scn.nextLine());
			 num2 = Integer.parseInt(scn.nextLine());
			 Calculator obj1 = new Calculator(num1, num2); 
			 obj1.addition(); 
			 obj1.subtraction(); 
			 obj1.multiply(); 
			 obj1.division(); 
		 }
		 catch(NumberFormatException e) { 
			 System.out.println("invalid input " + e);
		 }
	 }

}

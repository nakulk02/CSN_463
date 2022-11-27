import java.util.Scanner;

class Calculator {
    private int num1; 
    private int num2;

     public Calculator(int num1, int num2) { 
         this.num1 = num1;
         this.num2 = num2;
     }

 	public int addition() {  
 		int ans = num1 + num2; 
		System.out.println("Sum : " + ans);
		return ans;
	}
	
	public int subtraction() { 
		int ans = num1 - num2;
		System.out.println("Difference: " + ans);
		return ans;
	}
	
	public double division() {
		double ans = (double) num1 / num2; 
		System.out.println("Division : " +ans);
		return ans;
	}
	
	public int multiply() {
		int ans = num1 * num2; 
	    System.out.println("Product : " + ans);
	    return ans;
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
			 
			
			 num1 = Integer.parseInt(scn.nextLine());
			 
			 num2 = Integer.parseInt(scn.nextLine());
			 
			 Calculator obj2 = new Calculator(num1, num2); 
			 obj2.subtraction(); 
			 
			 
			 num1 = Integer.parseInt(scn.nextLine())
			 num2 = Integer.parseInt(scn.nextLine());
			 
			 Calculator obj3 = new Calculator(num1, num2);
			 obj3.multiply(); 
			 
			 
			 num1 = Integer.parseInt(scn.nextLine());
			 num2 = Integer.parseInt(scn.nextLine());
			 
			 Calculator obj4 = new Calculator(num1, num2); 
			 obj4.division(); 
		 }
		 catch(NumberFormatException e) { 
			 System.out.println("invalid input " + e);
		 }
	 }

}

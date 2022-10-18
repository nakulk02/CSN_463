package assignment3;
import java.util.Scanner;  // Import the Scanner class

public class Q4 {
	public static void main(String[] args) 
	{
		Scanner scnr=new Scanner(System.in);
		int n=scnr.nextInt();
		System.out.println("Input number: "+n);
		System.out.print("Hailstone sequence: "+n+" ");
		while(n!=1)
		{
			if(n%2==0)
			{
				n=n/2;
			}
			else
			{
				n=3*n+1;
			}
			System.out.print(n+" ");
		}
	}
}

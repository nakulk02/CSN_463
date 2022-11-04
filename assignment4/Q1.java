import java.util.Scanner;
import java.util.*;


public class Q1 {
	public static void main(String args[])
	{
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the initial size of the vector:");
	    int vector_size=scan.nextInt(),adding;
	    String input;
		Vector<String> temp=new Vector<String>(vector_size);
		System.out.println("Do you want to add an element in the vector? y or n");
		input=scan.next();
		while(input.equals("y") )
		{
			System.out.println("Enter number:");
			adding=scan.nextInt();
			temp.addElement(String.valueOf(adding));
			System.out.println("Do you want to add an element in the vector? y or n");
			input=scan.next();
		}
		System.out.print("Vector: ");
		for (String x:temp)
		{
			System.out.print(x+" ");
		}
	}

}

package assignment5;
import java.util.Scanner;

class Marks{
	protected String roll_no,name;
	protected int marks;
	void value()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number:");
		roll_no=sc.nextLine();
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter marks:");
		marks=sc.nextInt();
	}
}
class Physics extends Marks
{
	Physics()
	{
		System.out.print("For Physics:");
		super.value();
	}
}
class Mathematics extends Marks
{
	Mathematics()
	{
		System.out.print("For Mathematics:");
		super.value();
	}
}
class Chemistry extends Marks
{
	Chemistry()
	{
		System.out.print("For Chemistry:");
		super.value();
	}
}

public class Q3 {
	Physics P;
	Mathematics M;
	Chemistry C;
	
	
}

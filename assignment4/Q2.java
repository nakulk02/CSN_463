package assignment4;
import java.util.*;

class Employee{
	int yoj;
	String name,address;
	public Employee(int x,String y,String z)
	{
		yoj=x;
		name=y;
		address=z;
	}
}

public class Q2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of your organization:");
		int employee_number=scan.nextInt();
		int yoj;
		String name,address;
		Employee info[]=new Employee[employee_number];
		for(int i=0;i<employee_number;i++)
		{
			System.out.println("Enter the name:");
			name=scan.next();
			System.out.println("Enter the year of joining:");
			yoj=scan.nextInt();
			System.out.println("Enter the address:");
			address=scan.next();
			Employee new_employee=new Employee(yoj,name,address);
			info[i]=new_employee;
			System.out.println();
		}
		System.out.println("Name        Year of joining        Address");
		for (Employee x:info)
		{
			System.out.println(x.name+"        "+x.yoj+"           "+x.address);
		}
		
	}

}

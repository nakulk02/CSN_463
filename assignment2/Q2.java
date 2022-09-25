package assignment2;

public class Q2 {
	public static void main(String args[])
	{
		int num1=18,num2=39,num3=23;
		System.out.println("Three numbers: "+num1+" , "+num2+" , "+num3);
		System.out.print("Minimum of the numbers: ");
		if(num1>num2)
		{
			if(num2>num3)
			{
				System.out.println(num3);
			}
			else
			{
				System.out.println(num2);
			}
		}
		else
		{
			if(num1<num3)
			{
				System.out.println(num1);
			}
			else
			{
				System.out.println(num3);
			}
		}
		
	}

}
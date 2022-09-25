package assignment2;

public class Q4 {
	public static void main(String args[])
	{
		int old_population=80000,new_population=80000,year_count=0;
		System.out.println("Old population: "+old_population);
		while(new_population<=150000)
		{
			new_population+=(new_population*5)/100;
			year_count++;
		}
		System.out.println("Year count when population exceeds 15000: "+year_count);
		System.out.println("New population:"+new_population);
		
		
	}
}

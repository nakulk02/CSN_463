public class Q6 {
	public static void main(String args[])
	{
		int num=3,count=1;
		System.out.print("All the multiples of 3 from 3 to 36: ");
		do{
			System.out.print(num*count+" ");
			count++;
		}
		while(count*num<=36);
	}
}

public class Q1 {
	public static void main(String[] args) 
	{
		String first="tank";
		String second ="plane";
		int i=0,j=0;
		int len1=first.length(),len2=second.length();
		while(i!=len1 && j!=len2)
		{
			if((int)first.charAt(i)==(int)second.charAt(j))
			{
				i++;
				j++;
			}
			else if((int)first.charAt(i)<(int)second.charAt(j))
			{
				System.out.println("Lexicographically smaller string: "+first);
				return;
			}
			else
			{
				System.out.println("Lexicographically smaller string: "+second);
				return;
			}
		}
		if(i==len1)
		{
			System.out.println("Lexicographically smaller string: "+first);
		}
		if(j==len2)
		{
			System.out.println("Lexicographically smaller string: "+second);
		}
		
	}
}

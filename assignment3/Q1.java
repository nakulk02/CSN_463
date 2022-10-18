public class Q1 {
	public static void main(String[] args) 
	{
		String first=new String("tank");
		String second =new String("plane");
		int compare=first.compareTo(second);
		if(compare<0)
		{
			System.out.println("Lexicographically smaller string:"+first);
		}
		else if(compare>0)
		{
			System.out.println("Lexicographically smaller string:"+second);
		}
		else
		{
			System.out.println("Both strings are same.");
		}
		
	}
}

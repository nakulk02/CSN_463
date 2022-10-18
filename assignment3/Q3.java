import java.util.Arrays;

public class Q3 {
	public static void main(String[] args) 
	{
		String str=new String("djmomvvytyczazofvneorm");
		System.out.print("Input string: "+str);
		char temp[]=str.toCharArray();
		Arrays.sort(temp);
		String str2=new String(temp);
		System.out.print("\nSorted string: "+str2);
	}
}

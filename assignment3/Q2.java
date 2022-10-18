public class Q2 {
	public static void main(String[] args) 
	{
		int size=20;
		int frequency_array[]=new int[size];
		for(int i=0;i<size;i++)
		{
			frequency_array[i]=0;
		}
		int input_array[]= {1,2,3,2,1,5,6,8,3,4,5,6,3,6,7};
		System.out.print("Input array: { ");
		for(int i=0;i<input_array.length;i++)
		{
			if(i==input_array.length-1)
			{
				System.out.print(input_array[i]+" }");
			}
			else
			{
				System.out.print(input_array[i]+", ");
			}
			frequency_array[input_array[i]]++;
		}
		int index=0;
		for(int i=0;i<size;i++)
		{
			while(frequency_array[i]!=0)
			{
				input_array[index]=i;
				index++;
				frequency_array[i]--;
			}
		}
		System.out.print("\nSorted array: { ");
		for(int i=0;i<input_array.length;i++)
		{
			if(i==input_array.length-1)
			{
				System.out.print(input_array[i]+" }");
			}
			else
			{
				System.out.print(input_array[i]+", ");
			}
		}
		
		
	}
}

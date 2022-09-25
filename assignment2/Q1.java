public class Q1 {
	public static void main(String[] args) 
	{
		double score=80.00000000000001;
		System.out.println("Value of score before condition:"+score);
		if(score<90 && score>80)
		{
			score+=5;
		}
		System.out.println("Value of score after condition:"+score);
	}
}

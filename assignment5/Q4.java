package assignment5;

public class Q4 {
	static int a = 20;
	Q4() {
	a++;
	}
	Void m1() {
	a++;
	System.out.println(a);
	}
	public static void main(String[]
	args)
	{
		Q4 obj = new Q4();
		Q4 obj2 = new Q4();
		Q4 obj3 = new Q4();
		obj3.m1();
	}
}

// As Void is a class and cannot be used as a return type therefore it will not compile.
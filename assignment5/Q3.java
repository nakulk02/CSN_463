package assignment5;
import java.util.Scanner;

class Marks{
	public String name;
	public int roll_no;
	public int marks;
	
}
class Physics extends Marks
{
	Physics(int m,String namee,int roll){
	    marks = m;
	    roll_no = roll;
	    name = namee;
	}
}
class Mathematics extends Marks
{
	Mathematics(int m,String namee, int roll){
	    marks = m;
	    roll_no = roll;
	    name = namee;
	}
}
class Chemistry extends Marks
{
	Chemistry(int m,String namee,int roll){
	    marks = m;
	    roll_no = roll;
	    name = namee;
	}
}

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of students: ");
      int num = sc.nextInt();
      for(int i = 0;i<num;i++){
          int roll_no;
          String name;
          System.out.println();
          System.out.println("Enter name of student- ");
          name = sc.next();
          roll_no=i;
          int marks;
          System.out.print("Enter marks in Physics- ");
          marks = sc.nextInt();
	        Physics P = new Physics(marks,name,roll_no);
          System.out.print("Enter marks in Mathematics- ");
          marks = sc.nextInt();
	        Mathematics M = new Mathematics(marks,name,roll_no);
          System.out.print("Enter marks in Chemistry- ");
	        marks = sc.nextInt();
	        Chemistry C = new Chemistry(marks,name,roll_no);
      	System.out.println("Total marks:-");
	        System.out.println((P.marks+C.marks+M.marks));
      	System.out.println("Average marks:-");
	        System.out.println(((P.marks+C.marks+M.marks)/3.000));
      }
  }
}
package assignment5;

interface Mammals {
    default void print()
    {
        System.out.println("I am mammal");
    }
}
 
// Interface 2
interface MarineAnimals {
 
    default void print()
    {
        System.out.println("I am a marine animal");
    }
}

class BlueWhale implements Mammals, MarineAnimals {

    public void print()
    {
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
}

class Q1{
	 public static void main(String args[])
	    {
		 	BlueWhale bw = new BlueWhale();
		 	bw.print();
		 }
}


//We can not inheret multiple classes therefore I have used interfaces
package assignment5;

class Mammals{
	void Category(){
		System.out.print("I am mammal");
	}
}
class MarineAnimals{
	void Category(){
		System.out.print("I am a marine animal");
	}
}
class BlueWhale extends Mammals,MarineAnimals{
	void Category(){
		System.out.print("I belong to both the categories: Mammals as well as Marine Animals");
	}
}


public class Q1 {

}

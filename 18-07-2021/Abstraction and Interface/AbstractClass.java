/**
 * 
 * @author Talha Yaseen
 *
 * if anyone method of class is of abstract, then
 *   class must be of abstract type (vice-versa isn't correct)
 *
 * abstract methods soesn;t has body 
 *
 * abstract class is not a 100% abstraction (0-100% abstraction)
 *
 * class which inherits abstract class should have body of all the 
 *   abstract methods
 */

abstract class Test {
	int y;
	
	abstract void printRollNo(int roll);
	
	void printName(String name) {
		System.out.println("Name: " + name);
	}
}

public class AbstractClass extends Test {
	int x = 12;
	
	void printRollNo(int r) {
		System.out.println("Roll no: " + r);
	}
	
	public static void main(String[] args) {
		AbstractClass obj = new AbstractClass();
		
		System.out.println("x = " + obj.x);
		obj.printRollNo(19);
		obj.printName("Talha");
	}
}

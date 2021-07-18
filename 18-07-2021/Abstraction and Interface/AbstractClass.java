/**
 * 
 * @author Talha Yaseen
 *
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

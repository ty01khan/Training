/**
 * 
 * @author Talha Yaseen
 *
 * we can inherit multiple Interfaces in a class
 *
 * all methods of a interface should have public keyword
 * a class inherits interface, should have implementation of 
 *   all the methods declare in interface
 */
public class InterfaceTest implements Interface1, Interface2 {
	public void printRollNo(int r) {
		System.out.println("Roll no: " + r);
	}
	
	public void printName(String n) {
		System.out.println("Name: " + n);
	}
	
	public String getFirstName(String fn) {
		return fn;
	}
	
	public String getLastName(String ln) {
		return ln;
	}
	
	public void fullName(String fn, String ln) {
		System.out.println("Fullname: " + fn + " " + ln);
	}
	
	public static void main(String[] args) {
		InterfaceTest obj1 = new InterfaceTest();
		
		obj1.printRollNo(19);
		obj1.printName("Yaseen");
		System.out.println(obj1.x);
		
		obj1.fullName(obj1.getFirstName("Abhinav"), obj1.getLastName("Singh"));
	}

}

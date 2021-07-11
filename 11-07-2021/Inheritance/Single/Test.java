package Single;

/**
 * 
 * @author Talha Yaseen
 * 
 * 
 * Single Inheritance: when single child inherits the property of parent
 */
public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setName("Talha Yaseen");
		emp.setAge(22);
		emp.setID("yaseen.k");
		
		System.out.println("Name: " + emp.getName());
		System.out.println("Age: " + emp.getAge());
		System.out.println("Employee ID: " + emp.getID());
	}

}

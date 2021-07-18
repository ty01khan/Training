/**
 * 
 * @author Talha Yaseen
 * 
 * private keyword is used to hide the data
 * 
 * Encapsulation: hiding the sensitive data
 * 	So, to set and access the data we use setter 
 *  and getter methods
 */
class Employee {
	private int empID;
	
	public void setEID(int id) {
		empID = id;
	}
	
	public int getEID() {
		return empID;
	}
}

public class Encapsulation {
	
	public static void main(String[] args) {
		Employee empObj = new Employee();
		
		empObj.setEID(101);
		System.out.println("Employee ID: " + empObj.getEID());
	}

}

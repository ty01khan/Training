package MultiLevel;

/**
 * 
 * @author Talha Yaseen
 * 
 * 
 * Multilevel Inheritance: when a sub class inherits all the properties and
 *   behaviours of more than one super class at multiple levels.
 */
public class Test {

	public static void main(String[] args) {
		Area obj = new Area();
		
		double add = obj.addition(10,  20);
		double sub = obj.subtraction(20, 10);
		double mul = obj.multiplication(2.5, 7);
		double div = obj.division(10,  4);
		double sqr = obj.sqr(2.5);
		double sqrt = obj.squareRoot(26);
		double sqrArea = obj.square(4);
		double rectArea = obj.rectangle(4,  3.6);
		double circleArea = obj.circle(5);
		
		System.out.println("Add: " + add);
		System.out.println("Subtract: " + sub);
		System.out.println("Multiply: " + mul);
		System.out.println("Divide: " + div);
		System.out.println("Square: " + sqr);
		System.out.println("Square root: " + sqrt);
		System.out.println("Square Area: " + sqrArea);
		System.out.println("Rectangle Area: " + rectArea);
		System.out.println("Circle Area: " + circleArea);
	}

}

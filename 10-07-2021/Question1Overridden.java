/**
 * 
 * @author Talha Yaseen
 * 
 * 
 * Overridden: if subclass (child class) has the same method as declared in the parent class
 * Overloading: if a class has multiple methods having same name but different in parameters
 */

// parent class
public class Question1Overridden {
	public void makeSound() {
		System.out.println("Sounds like");
	}
}

// subclass
class Cat extends Question1Overridden {
	@Override
	public void makeSound() {
		System.out.println("Meow");
	}
}

//subclass
class Dog extends Question1Overridden {
	@Override
	public void makeSound() {
		System.out.println("Woof");
	}
}
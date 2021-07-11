/**
 * 
 * @author Talha Yaseen
 * 
 * 
 * Overridden: if subclass (child class) has the same method as declared in the parent class
 * Overloading: if a class has multiple methods having same name but different in parameters
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Question1OverriddenTest{

    public static void main(String args[]) {
        /**
         * Now Pet will show How Polymorphism work in Java
         */
        List<Question1Overridden> pets = new ArrayList<Question1Overridden>();
        pets.add(new Cat());
        pets.add(new Dog());
     
        /**
         * pet variable which is type of Pet behave different based
         *   upon whether pet is Cat or Dog
         */
        for(Question1Overridden pet : pets){
            pet.makeSound();
        }
   
    }
}
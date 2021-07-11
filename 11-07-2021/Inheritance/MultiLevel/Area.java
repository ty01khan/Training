package MultiLevel;

/**
 * 
 * @author Talha Yaseen
 *
 */
public class Area extends AdvanceCalc {
	public double square(double a) {
		return a*a;
	}
	
	public double rectangle(double l, double b) {
		return l*b;
	}
	
	public double circle(double r) {
		return Math.PI*r*r;
	}
}

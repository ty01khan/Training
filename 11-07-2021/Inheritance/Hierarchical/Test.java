package Hierarchical;

/**
 * 
 * @author Talha Yaseen
 *
 * Heirarchical inheritance: when one or more subclasses inherits all the properties and 
 *   behaviours of one super class.
 */
class Point {
	private double x, y;
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	}
	
}

class Trapezoid {
	private Point p1, p2, p3, p4;
	Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
		p3 = new Point(x3, y3);
		p4 = new Point(x4, y4);		
	}
	
	Point getPoint1() {
		return p1;
	}
	
	Point getPoint2() {
		return p2;
	}
	
	Point getPoint3() {
		return p3;
	}
	
	Point getPoint4() {
		return p4;
	}
	
	double getHeight(){
		if (getPoint1().getY() == getPoint2().getY()) {
			return Math.abs(getPoint2().getY() - getPoint3().getY());
		}else {
			return Math.abs(getPoint1().getY() - getPoint2().getY());
		}
	}
	
	double getArea() {
		return getHeight() * getSumOfTwoParallelSides() * 0.5;
	}
	
	double getSumOfTwoParallelSides() {
		if (getPoint1().getY() == getPoint2().getY()) {
			return Math.abs(getPoint1().getX() - getPoint2().getX()) + Math.abs(getPoint3().getX() - getPoint4().getX());
		}else {
			return Math.abs(getPoint1().getX() - getPoint4().getX()) + Math.abs(getPoint2().getX() - getPoint3().getX());
		}
	}
}

class Parallelogram extends Trapezoid {
	Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
}

class Rectangle extends Trapezoid {
	Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
}

class Square extends Trapezoid {
	Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
}

public class Test {
	public static void main(String[] args) {
		Trapezoid t = new Trapezoid(0, 0, 10, 0, 8, 5.7, 4, 5.7);
		
		Parallelogram p = new Parallelogram(0, 0, 2, 5, 8, 5, 6, 0);
		
		Rectangle r = new Rectangle(-1, -2.2, -1, 7.3, 8, 7.3, 8, -2.2);
		
		Square s = new Square(4, 0, 16, 0, 16, 12, 4, 12);
		
		System.out.printf("%.1f%n%.1f%n%.1f%n%.1f%n", t.getArea(), p.getArea(), r.getArea(), s.getArea());
	}
}

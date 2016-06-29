/* Circle.java

 * Author: Alyssa Lagimoniere
 * Submission Date: 3/29/15
 * 
 * Purpose: To create methods to get the different
 * dimensions of a circle.
 * 
 * Statement of Academic Honesty: 
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia. 
 */

public class Circle {
	
	private double radius;	// declare the private double instance  radius
	private double x;		// declare the private double instance  x
	private double y;		// declare the private double instance  y
	
	//----------------------------------------------
	// Class Constructor: set the initial values of
	//                    the instance variables
	//                    for this circle
	//----------------------------------------------	
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;  	   	
	}
		
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		return x;
	}
	
	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		return y;
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		return radius;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public double setX(double x) {
		return this.x = x;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public double setY(double y) {
		return this.y = y;
	}	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public double setRadius(double radius) {
		if (radius > 0) {
			return this.radius = radius;
		} else {
			return radius;
		}
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		double diameter = radius*2;
		return diameter;
	}

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		double area = Math.PI*(radius*radius);
		return area;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		double perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		return (radius == 1 && x == 0 && y == 0);
	}
		
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
	String center = "\tcenter: (" + x + "," + y + ")\n";
	String r = "\t\tradius: " + radius;
	return center + r;
	}

	//--------------------------------------------------------
	// anotherCircle - This method returns true when the 
	//				   radius and centers of both circles 
	//				   are the same; otherwise, it returns 
	//				   false. This method can be implemented 
	//				   in one line.
	//--------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		return (this.x == anotherCircle.x) && (this.y == anotherCircle.y) && (this.radius == anotherCircle.radius);
	}
	
	//--------------------------------------------------------
	// isConcentric - This method returns true when the 
	//				  circle executing the method has the
	//				  same center as anotherCircle but two 
	//				  circles are not equal. 
	//--------------------------------------------------------
	public boolean isConcentric(Circle anotherCircle) {
		return (this.x == anotherCircle.x && this.y == anotherCircle.y);
	}
	
	//--------------------------------------------------------
	// distance - This method returns the distance between 
	//			  the centers of the circle executing the 
	//			  method and anotherCircle. Let (x, y) and 
	//			  (xa, ya) be the centers of the circle 
	//			  executing the method and anotherCircle 
	//			  respectively, the distance between their 
	//			  centers is computed by (𝑥 − 𝑥!)! + (𝑦 − 𝑦!)!
	//--------------------------------------------------------
	public double distance(Circle anotherCircle) {
		return Math.sqrt((Math.pow((this.x - anotherCircle.x),2)) + (Math.pow((this.y - anotherCircle.y),2)));
	}
	
	//--------------------------------------------------------
	// intersects - The method intersects returns true when 
	//				the circle executing the method and 
	//				anotherCircle have an intersecting area 
	//				(one or more points enclosed by both 
	//				circles); otherwise, it returns false.
	//--------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		return (distance(anotherCircle) < (this.radius + anotherCircle.radius));
	}
}
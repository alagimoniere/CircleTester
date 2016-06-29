/* CircleTester.java

 * Author: Alyssa Lagimoniere
 * Submission Date: 3/29/15
 * 
 * Purpose: A client to test the functionality of objects
 * of the class Circle.
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

public class CircleTester {

	public static void main(String[] args) {

		Circle circle1 = new Circle(0.0, 0.0, 2);
		Circle circle2 = new Circle(2.0, 1.0, 1);

		System.out.println("circle1 = " + circle1);
		System.out.println("circle2 = " + circle2);

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		circle1.setRadius(-2.0);

		// Reset the center of circle1 (-3.0,4.0).
		circle1.setX(-3.0);
		circle1.setY(4.0);

		// Print circle1 characteristics (center and radius), use a statement
		// similar to the previous println statements. Note that is not 
		// necessary to call the method toString, why?
		System.out.println("circle1 = " + circle1);
		
		// Set the circle2 radius to 5.3.
		circle2.setRadius(5.3);

		// Print circle2 characteristics (center and radius), use a statement
		// similar to the first and
		// second println statements.
		System.out.println("circle2 = " + circle2);

		// Print circle1 diameter, area and perimeter.
		System.out.println("circle1 = " + "\tdiameter: " + circle1.diameter() + "\n\t\tarea: " + circle1.area() + "\n\t\tperimeter: " + circle1.perimeter());

		// Print circle2 diameter, area and perimeter.
		System.out.println("circle2 = " + "\tdiameter: " + circle2.diameter() + "\n\t\tarea: " + circle2.area() + "\n\t\tperimeter: " + circle2.perimeter());
		
		// Display whether circle1 is a unit circle.
		System.out.println("unit circle?: \t" + circle1.isUnitCircle());
		
		// Display whether circle2 is a unit circle.
		System.out.println("unit circle?: \t" + circle2.isUnitCircle());

		// Your additional tests should be placed below here.
		
		//Compare circles
		System.out.println(circle1.equals(circle2));
		circle2.setX(-3.0);
		circle2.setY(4.0);
		circle2.setRadius(2);
		System.out.println(circle1.equals(circle2));
		circle2.setX(2.0);
		circle2.setY(1.0);
		System.out.println(circle1.equals(circle2));
		
		//Compare centers
		circle1.setX(2);
		circle1.setY(1);
		circle2.setRadius(4);
		System.out.println(circle1.isConcentric(circle2));
		circle1.setX(1);
		System.out.println(circle2.isConcentric(circle1));
		circle1.setX(2);
		circle2.setRadius(2);
		System.out.println(circle1.isConcentric(circle2));
		
		//Return distance
		System.out.println(circle1.distance(circle2));
		circle1.setX(10);
		System.out.println(circle1.distance(circle2));
		circle1.setY(-7);
		System.out.println(circle1.distance(circle2));

		//Check if they intersect
		System.out.println(circle1.intersects(circle2));
		circle1.setX(0);
		circle1.setY(2);
		System.out.println(circle1.intersects(circle2));
		circle2.setRadius(10);
		System.out.println(circle1.intersects(circle2));

	}
}
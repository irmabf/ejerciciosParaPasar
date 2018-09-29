package utilities;

import beans.Point;

public class Geometry {
	
	public static void distanceBetweenTwoPoints(Point p1, Point p2) {
		 System.out.println("We are going to calculate the distance between two points");
	     System.out.println("Point 1: "+p1);
	     System.out.println("Point 2: "+p2);        
	     double x = Math.pow((p1.getPx() - p2.getPx()),2);
	     double y = Math.pow((p1.getPy() - p2.getPy()),2);        
	     double distance = Math.sqrt(x+y);
	     System.out.println("Distance: "+distance);
	}
	
	public static void distanceToCenter(Point p1) {
		distanceBetweenTwoPoints(p1, new Point(0,0));
		
	}
}

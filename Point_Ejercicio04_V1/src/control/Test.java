package control;

import beans.Pixel;
import beans.Point;
import utilities.Geometry;

public class Test {
	
	public static void test1() {
		Point point1 = new Point();
		point1.createPoint();
		point1.printReport();	
		
	}
	
	public static void test2() {
		Point point2 = new Point();
		point2.createPoint();
		point2.printReport();
		
		Pixel pixel1 = new Pixel();
		
		pixel1.createPixel();
		pixel1.printReport1();
		
		Pixel pixel2 = new Pixel(point2, "white");
		
		pixel2.printReport1();
			
	}
	
	public static void test3() {
		Point coordinate1 = new Point(3,5);
		Point coordinate2 = new Point(4, 7);
		
		Geometry.distanceBetweenTwoPoints(coordinate1, coordinate2);
		Geometry.distanceToCenter(coordinate1);
		
	}

}

package beans;

import utilities.ReadData;

public class Point {
	
	private int px;
	private  int py;
	
	public Point() {}
	
	public Point(int px, int py) {
		this.px = px;
		this.py = py;
	}

	public int getPx() {
		return px;
	}

	public void setPx(int px) {
		this.px = px;
	}

	public int getPy() {
		return py;
	}

	public void setPy(int py) {
		this.py = py;
	}

	@Override
	public String toString() {
		return "Point [px=" + px + ", py=" + py + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + px;
		result = prime * result + py;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (px != other.px)
			return false;
		if (py != other.py)
			return false;
		return true;
	}
	
	public void createPoint() {
		System.out.println("We are going to create a point...");
		
		this.setPx(ReadData.readInt("Enter a coordenate for x: "));
		this.setPy(ReadData.readInt("Enter a coordenate for y: "));
			
	}
	
	public void printReport() {
		System.out.println(this.toString());
	}

}

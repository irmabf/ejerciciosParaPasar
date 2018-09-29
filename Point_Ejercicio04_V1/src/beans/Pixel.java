package beans;

import utilities.ReadData;

public class Pixel {
	
	private Point point = new Point();
	
	private String color;
	
	public Pixel() {}
	
	public Pixel(Point point, String color) {
		this.point = point;
		this.color = color;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((point == null) ? 0 : point.hashCode());
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
		Pixel other = (Pixel) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (point == null) {
			if (other.point != null)
				return false;
		} else if (!point.equals(other.point))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pixel [point=" + point + ", color=" + color + "]";
	}
	
	public void createPixel() {
		System.out.println("We are going to create a pixel");
		this.point.createPoint();
		
		this.color = ReadData.readString("Choose a color: ");
		
	}
	public void printReport1() {
		System.out.println(this.toString());
	}

}

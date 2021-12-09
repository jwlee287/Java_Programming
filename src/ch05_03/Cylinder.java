package ch05_03;

public class Cylinder {
	Circle c;
	double height;
	
	public Cylinder(double radius, double height) {
		c = new Circle(radius);
		this.height = height;
	}
	public double getVolume() {
		return c.getArea() * height;
	}
	
	public static void main(String[] args) {
		Cylinder cylin = new Cylinder(2.8, 5.6);
		System.out.println(cylin.getVolume());
	}
}

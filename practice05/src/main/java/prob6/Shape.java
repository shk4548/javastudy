package prob6;

public abstract class Shape {
	
	protected double width ;
	protected double height;
	
	public Shape(double width , double height) {
		this.width = width;
		this.height = height;	
	}
	
	
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
}

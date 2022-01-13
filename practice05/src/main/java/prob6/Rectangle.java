package prob6;

public class Rectangle extends Shape implements Resizable{

	public Rectangle(double width, double height) {
		super(width, height);
	}

	@Override
	public void resize(double s) {
		width = width * s;
		height = height * s;
	}

	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getPerimeter() {
		return (2*width) + (2*height);
	}

	
}

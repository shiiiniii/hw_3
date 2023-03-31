package finalwork;

public class Circle extends Figure{
	protected double radius;
	
	public Circle(double radius) throws Exception {
		this.radius = radius;
		if(radius < 0) {
			throw new Exception("Такого круга не может быть");
		}
	}

	
	@Override
	protected double area() { 
		return Math.PI * radius * radius;
	}
	
	@Override
	protected double perimeter() {
		return 2 * Math.PI * radius;
	}
	

	public double getRadius() {
		
		return radius;
	}

	
}

package finalwork;

public class Triangle extends Figure{
	protected double sideA;
	protected double sideB;
	protected double sideC;
	
	public Triangle(double sideA, double sideB, double sideC) throws Exception {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		 
		if (!((sideA + sideB) > sideC &&
				(sideB + sideC) > sideA &&
				(sideC + sideA) > sideB)){
			throw new Exception("Такого треугольника не бывает");
		}
	}
	
	@Override
	protected double area() {
		double halfP = this.perimeter() / 2; 
		return Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
	}
	
	@Override
	protected double perimeter() {
		return sideA + sideB + sideC;
	}
	
	
	public double getSideA() {
		
		return sideA;
	}

	public double getSideB() {
		
		return sideB;
	}	

	public double getSideC() {
		
		return sideC;
	}	
	
	
}

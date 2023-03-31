package finalwork;

public class Program {
	public static void main(String[] args) throws Exception {
		Figure[] figures = new Figure[] {
				new Rectangle(4, 5),
				new Square(5),
				new Triangle(7, 7, 8),
				new Circle(8),

				
				
		};
		System.out.println("Периметр прямоугольника со сторонами  " + ((Rectangle)figures[0]).getSideA() + " и "+((Rectangle)figures[0]).getSideB() + " равен: " + figures[0].perimeter());
		System.out.println("Площадь прямоугольника со сторонами   " + figures[0].area());
		System.out.println("Периметр квадрата с длиной одной из сторон  " + ((Square)figures[1]).getSideA() + " равен: " + figures[1].perimeter());
		System.out.println("Площадь квадрата с длиной одной из сторон  " + ((Square)figures[1]).getSideA() + " равна: "  + figures[1].area());
		System.out.println("Периметр треугольника со сторонами  " + ((Triangle)figures[2]).getSideA()+ " , "+((Triangle)figures[2]).getSideB() + " и "+ ((Triangle)figures[2]).getSideC() + " равен: " + figures[2].perimeter());
		System.out.println("Площадь треугольника со сторонами  " + ((Triangle)figures[2]).getSideA()+ " , "+((Triangle)figures[2]).getSideB() + " и "+ ((Triangle)figures[2]).getSideC() + " равна: "  + figures[2].area());
		System.out.println("Периметр круга с радиусом  " + ((Circle)figures[3]).getRadius()+ " равен: " + figures[3].perimeter());
		System.out.println("Площадь круга с радиусом  " + ((Circle)figures[3]).getRadius()+ " равна: " + figures[3].area());	
	}

}

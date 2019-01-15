package Entidade;

public class calcu_triangulo {
	
	public double a;
	public double b;
	
	public double area() {
		return a * b;
	}
	
	public double perimetro() {
		return 2 * (a + b);
	}
	
	public double diagonal() {
		return Math.sqrt(a * a + b * b);
	}
	
	public String ToString() {
		return "Area : "
			+ String.format("%.2f", area())
			+ ", Perimetro: "
			+ String.format("%.2f", perimetro())
			+ ", Diagonal: "
			+ String.format("%.2f", diagonal());
	}

}

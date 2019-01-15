package util;

public class converter_dolar {
	
	public double dolar;
	public double reais;

	public double dolar_reais() {
		return dolar * reais + (6 * dolar * reais / 100);
	}
	
	public String toString() {
		return "Você pode comprar: $ "
			+ String.format("%.2f", dolar_reais())
			+ " dolares";
	}
}

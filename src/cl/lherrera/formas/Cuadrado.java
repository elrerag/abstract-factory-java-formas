package cl.lherrera.formas;

public class Cuadrado implements Forma {
	private double lado;

	public Cuadrado() {
		this.lado = 0.0;
	}
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	@Override
	public double area() {
		return Math.pow(this.lado, 2);
	}
	
}

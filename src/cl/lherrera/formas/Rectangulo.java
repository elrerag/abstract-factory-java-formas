package cl.lherrera.formas;

public class Rectangulo implements Forma {
	private double ladoA;
	private double ladoB;
	
	public Rectangulo() {
		this.ladoA = 0.0;
		this.ladoB = 0.0;
	}

	public Rectangulo(double ladoA, double ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	@Override
	public String toString() {
		return "Rectangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + "]";
	}

	@Override
	public double area() {
		return this.ladoA * this.ladoB;
	}

}

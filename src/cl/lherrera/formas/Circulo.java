package cl.lherrera.formas;

public class Circulo implements Forma {

	private double radio;

	public Circulo() {
		this.radio = 0.0;
	}
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(this.radio, 2);
	}
	
}

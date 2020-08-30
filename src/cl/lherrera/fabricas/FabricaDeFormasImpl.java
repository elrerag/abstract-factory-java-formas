package cl.lherrera.fabricas;

import cl.lherrera.formas.Cuadrado;
import cl.lherrera.formas.Forma;
import cl.lherrera.formas.Rectangulo;

public class FabricaDeFormasImpl implements FabricaDeFormas {

	@Override
	public Forma fabricarCuadrado(double lado) {
		return new Cuadrado(lado);
	}

	@Override
	public Forma fabricaRectangulo(double ladoA, double ladoB) {
		return new Rectangulo(ladoA, ladoB);
	}


}

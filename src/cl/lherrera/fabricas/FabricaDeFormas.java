package cl.lherrera.fabricas;

import cl.lherrera.formas.Forma;

public interface FabricaDeFormas {
	Forma fabricarCuadrado(double lado);
	Forma fabricaRectangulo(double ladoA, double ladoB);
	Forma fabricaCirculo(double radio);

}

package cl.lherrera;

import cl.lherrera.fabricas.FabricaDeFormas;
import cl.lherrera.fabricas.FabricaDeFormasImpl;
import cl.lherrera.formas.Forma;

public class Aplicacion {

	public static void main(String[] args) {
		FabricaDeFormas fabricaDeFormas = new FabricaDeFormasImpl();
		Forma cuadrado = fabricaDeFormas.fabricarCuadrado(2.0);
		Forma rectangulo = fabricaDeFormas.fabricaRectangulo(2.0, 3.0);
		
		imprimeArea(cuadrado);
		imprimeArea(rectangulo);
		
	}
	
	public static void imprimeArea(Forma forma) {
		System.out.println("El area de un " + forma + " es: " + forma.area());
	}

}

package figuras;

import java.awt.Color;

/** Un cuadrado es como un rectángulo pero con base y altura iguales. */
public class Cuadrado extends Rectangulo {
	/** Crea el cuadrado usando el mismo valor para el ancho y el alto. */
	public Cuadrado(double x, double y, Color color, double lado) {
		super(x, y, color, lado, lado);
	}
}

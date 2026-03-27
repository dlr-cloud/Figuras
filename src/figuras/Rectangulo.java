package figuras;

import java.awt.Color;

/** Clase para crear rectángulos con base y altura. */
public class Rectangulo extends Figura {
	/** Lo que mide de ancho. */
	private double base;
	/** Lo que mide de alto. */
	private double altura;

	/** Constructor para hacer el rectángulo con su sitio, color y medidas. */
	public Rectangulo(double x, double y, Color color, double base, double altura) {
		super(x, y, color);
		this.base = base;
		this.altura = altura;
	}

	/** Te da la base del rectángulo. */
	public double getBase() {
		return base;
	}

	/** Te da la altura del rectángulo. */
	public double getAltura() {
		return altura;
	}

	/** Cambia el valor de la base. */
	public void setBase(double base) {
		this.base = base;
	}

	/** Cambia el valor de la altura. */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/** Saca el perímetro sumando los lados. */
	public double perimetro() {
		return 2 * base + 2 * altura;
	}

	/** Saca el área multiplicando base por altura. */
	public double area() {
		return base * altura;
	}
}

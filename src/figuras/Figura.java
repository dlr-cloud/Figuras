package figuras;

import java.awt.Color;

/** Clase abstracta para definir lo que tienen en común todas las figuras. */
public abstract class Figura {
	/** Coordenada X del centro de la figura. */
	private double x;
	/** Coordenada Y del centro de la figura. */
	private double y;
	/** Color que tiene la figura. */
	private Color color;

	/** Constructor para poner la posición y el color a cualquier figura. */
	public Figura(double x, double y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	/** Método genérico para sacar el área (cada figura lo hace a su manera). */
	public abstract double area();

	/** Método genérico para sacar el perímetro. */
	public abstract double perimetro();
}

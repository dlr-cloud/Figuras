package figuras;

import java.awt.Color;

public class Triangulo extends Figura{
	/** Primer lado del triángulo. */
	private double lado1;
	/** Segundo lado del triángulo. */
	private double lado2;
	/** Tercer lado del triángulo. */
	private double lado3;

	/** Constructor para montar el triángulo con su sitio, color y lados. */
	public Triangulo(double x, double y, Color color, double lado1, double lado2, double lado3) {
		super(x, y, color);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	/** Te da el valor del lado 1. */
	public double getLado1() {
		return lado1;
	}

	/** Te da el valor del lado 2. */
	public double getLado2() {
		return lado2;
	}

	/** Te da el valor del lado 3. */
	public double getLado3() {
		return lado3;
	}

	/** Cambia el valor del lado 1. */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/** Cambia el valor del lado 2. */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/** Cambia el valor del lado 3. */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	/** Suma los tres lados para sacar el perímetro. */
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	/** Saca el área del triángulo usando una fórmula matemática. */
	public double area() {
		double sp = perimetro() / 2;
		return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
	}
}

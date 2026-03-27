package figuras;

import java.util.Scanner;
import java.awt.Color;

/** Clase principal que lanza el menú para probar las figuras. */
public class Pruebafigura {
	/** Texto que sale antes de decir el área. */
	private static final String texto_area = "El área es ";
	/** Texto que sale antes de decir el perímetro. */
	private static final String texto_perimetro = "El perímetro es ";
	/** La opción que elija el usuario en el menú. */
	private static int opcion;

	/** El método principal que arranca el programa y el bucle del menú. */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		do {
			opcion = mostrarMenu();
			if (opcion != 4) {
				System.out.print("Introduzca la coordenada x del centro: ");
				double x = teclado.nextDouble();
				System.out.print("Introduzca la coordenada y del centro: ");
				double y = teclado.nextDouble();
				switch (opcion) {
				case 1:
					procesoTriangulo(teclado, x, y);
					break;
				case 2:
					procesarRectangulo(teclado, x, y);
					break;
				case 3:
					procesarCuadrado(teclado, x, y);
					break;
				}
			}
		} while (opcion != 4);
		teclado.close();
	}

	/** Pide el lado y saca los datos de un cuadrado. */
	private static void procesarCuadrado(Scanner teclado, double x, double y) {
		System.out.print("Introduzca el lado del cuadrado: ");
		double lado = teclado.nextDouble();
		Cuadrado c = new Cuadrado(x, y, Color.red, lado);
		System.out.println(texto_perimetro + c.perimetro());
		System.out.println(texto_area + c.area());
	}

	/** Pide base y altura para sacar los datos de un rectángulo. */
	private static void procesarRectangulo(Scanner teclado, double x, double y) {
		System.out.print("Introduzca la base del rectángulo: ");
		double base = teclado.nextDouble();
		System.out.print("Introduzca la altura del rectángulo: ");
		double altura = teclado.nextDouble();
		Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
		System.out.println(texto_perimetro + r.perimetro());
		System.out.println(texto_area + r.area());
	}

	/** Pide los tres lados y saca los datos de un triángulo. */
	private static void procesoTriangulo(Scanner teclado, double x, double y) {
		System.out.print("Introduzca el lado 1 del triángulo: ");
		double lado1 = teclado.nextDouble();
		System.out.print("Introduzca el lado 2 del triángulo: ");
		double lado2 = teclado.nextDouble();
		System.out.print("Introduzca el lado 3 del triángulo: ");
		double lado3 = teclado.nextDouble();
		Triangulo t = new Triangulo(x, y, Color.red, lado1, lado2, lado3);
		System.out.println(texto_perimetro + t.perimetro());
		System.out.println(texto_area + t.area());
	}

	/** Enseña las opciones por pantalla y devuelve la que elijas. */
	public static int mostrarMenu() {
		int opción;
		System.out.println("1) Triángulo");
		System.out.println("2) Rectángulo");
		System.out.println("3) Cuadrado");
		System.out.println("4) Salir");
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Introduzca una opción (1-4): ");
			opción = teclado.nextInt();
			if (opción < 1 || opción > 4)
				System.out.println("Debe introducir un número entre 1 y 4");
		} while (opción < 1 || opción > 4);
		return opción;
	}
}

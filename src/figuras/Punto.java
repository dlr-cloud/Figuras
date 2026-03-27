package figuras;

/** Clase para manejar puntos con coordenadas X e Y. */
public class Punto {
	/** Posición horizontal. */
	private double x;
	/** Posición vertical. */
	private double y;

	/** Constructor básico que pone el punto a cero. */
	public Punto() {
		x = 0;
		y = 0;
	}

	/** Constructor para ponerle las coordenadas que quieras. */
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/** Constructor para copiar los datos de otro punto. */
	public Punto(Punto p) {
		x = p.x;
		y = p.y;
	}

	/** Te da la coordenada X. */
	public double getX() {
		return x;
	}

	/** Te da la coordenada Y. */
	public double getY() {
		return y;
	}

	/** Cambia la coordenada X. */
	public void setX(double x) {
		this.x = x;
	}

	/** Cambia la coordenada Y. */
	public void setY(double y) {
		this.y = y;
	}

	/** Calcula la distancia que hay hasta otro punto. */
	public double distancia(Punto p) {
		return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
	}

	/** Crea un punto que es el simétrico de este. */
	public Punto simetrico() {
		Punto nuevoP = new Punto(this.x * -1, this.y);
		return nuevoP;
	}

	/** Compara si este punto está en el mismo sitio que otro. */
	public boolean compara(Punto p) {
		if (p.x == x && p.y == y)
			return true;
		else
			return false;
	}

	/** Pasa las coordenadas a un texto fácil de leer. */
	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}
}

package fiap.forma;

public class Circulo extends Forma {
	
	public Circulo(int coordenadaX, int coordenadaY, double raio) {
		super(coordenadaX, coordenadaY, raio);
		// TODO Auto-generated constructor stub
	}

	public double calcularArea() {
		return Math.PI*(raio*raio);
	}

}
